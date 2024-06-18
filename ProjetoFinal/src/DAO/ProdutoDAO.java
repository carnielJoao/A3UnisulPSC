package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;


public class ProdutoDAO {
    
    public static ArrayList<Produto> MinhaLista = new ArrayList<Produto>();

    public ProdutoDAO() {
    }
    
    // Faz a conexão com o Banco
    public Connection getConexao() {

        Connection connection = null;  //inst�ncia da conex�o

        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conex�o
            String server = "localhost"; //caminho do MySQL
            String database = "db_inshelf";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "210195";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NãO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }
    
    // Retorna a Lista de Produtos(objetos)
    public ArrayList<Produto> getMinhaLista() {
        MinhaLista.clear(); 
        System.out.println("Iniciando o carregamento da lista de produtos...");

        try (Connection conn = this.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet res = stmt.executeQuery("SELECT * FROM tb_estoque")) {

            while (res.next()) {
                System.out.println("Carregando produto ID: " + res.getInt("id_produto"));
                int id = res.getInt("id_produto");
                String nomeProduto = res.getString("nome_produto");
                String descricaoProduto = res.getString("descricao_produto");
                int quantidadeProduto = res.getInt("quantidade_produto");
                float precoProduto = res.getFloat("preco_produto");
                LocalDate dataCadastro = res.getDate("data_cadastro").toLocalDate();
                String categoriaProduto = res.getString("categoria_produto");
                String editoraProduto = res.getString("editora_produto");
                String autorProduto = res.getString("autor_produto");
                int anoLancamento = res.getInt("anoLancamento_produto");

                Produto objeto = new Produto(id, nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, dataCadastro, categoriaProduto, editoraProduto, autorProduto, anoLancamento);
                MinhaLista.add(objeto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar produtos: " + ex.getMessage());
        }

        System.out.println("Lista de produtos carregada com sucesso. Tamanho da lista: " + MinhaLista.size());
        return MinhaLista;
    }
       
    // Cadastra novo Produto
    public boolean InsertProdutoBD(Produto objeto) {
    String sql = "INSERT INTO tb_estoque(id_produto, nome_produto, descricao_produto, quantidade_produto, preco_produto, data_cadastro, categoria_produto, editora_produto, autor_produto, anoLancamento_produto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNomeProduto());
            stmt.setString(3, objeto.getDescricaoProduto());
            stmt.setInt(4, objeto.getQuantidadeProduto());
            stmt.setFloat(5, objeto.getPrecoProduto());
            
            LocalDate localDate = objeto.getDataCadastro();
            stmt.setObject(6, localDate);
            
            stmt.setString(7, objeto.getCategoriaProduto());
            stmt.setString(8, objeto.getEditoraProduto());
            stmt.setString(9, objeto.getAutorProduto());
            stmt.setInt(10, objeto.getAnoLancamento());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    // Deleta um Produto espec�fico pelo seu campo ID
    public boolean DeleteProdutoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_estoque WHERE id_produto = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return true;
    }
    
    // Edita um Produto especifico pelo seu campo ID
    public boolean UpdateProdutoBD(Produto objeto) {

        String sql = "UPDATE tb_estoque SET nome_produto = ?, descricao_produto = ?, quantidade_produto = ?, preco_produto = ?, categoria_produto = ?, editora_produto = ?, autor_produto = ?, anoLancamento_produto = ? WHERE id_produto = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNomeProduto());
            stmt.setString(2, objeto.getDescricaoProduto());
            stmt.setInt(3, objeto.getQuantidadeProduto());
            stmt.setFloat(4, objeto.getPrecoProduto());

            stmt.setString(5, objeto.getCategoriaProduto());
            stmt.setString(6, objeto.getEditoraProduto());
            stmt.setString(7, objeto.getAutorProduto());
            stmt.setInt(8, objeto.getAnoLancamento());
            stmt.setInt(9, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    // Carrega o produto para exibir
    public Produto carregaProduto(int id) {
        
        Produto objeto = new Produto();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_estoque WHERE id = " + id);
            res.next();

            objeto.setNomeProduto(res.getString("nome_produto"));
            
            objeto.setDescricaoProduto(res.getString("descricao_produto"));
            
            objeto.setQuantidadeProduto(res.getInt("quantidade_estoque"));

            objeto.setPrecoProduto(res.getFloat("preco_produto"));
            
            LocalDate dataCadastro = res.getDate("data_cadastro").toLocalDate();
            objeto.setDataCadastro(dataCadastro);
            
            objeto.setCategoriaProduto(res.getString("categoria_produto"));
            
            objeto.setEditoraProduto(res.getString("editora_produto"));
            
            objeto.setAutorProduto(res.getString("autor_produto"));
            
            objeto.setAnoLancamento(res.getInt("anoLancamento_produto"));
           
            stmt.close();            
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return objeto;
    }
    
}
