package DAO;


import Model.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;


public class FuncionarioDAO {
        
    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();
    
    public FuncionarioDAO() {
    }
    
    // Faz a conexão com o Banco
    public Connection getConexao() {
    Connection connection = null;  // instância da conexão

    try {
        // Carregamento do JDBC Driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // Configurar a conexão
        String server = "localhost"; // caminho do MySQL
        String database = "db_inshelf";
        String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "210195";

        connection = DriverManager.getConnection(url, user, password);

        // Testando..
        if (connection != null) {
            System.out.println("Status: Conectado!");
        } else {
            System.out.println("Status: NÃO CONECTADO!");
        }

        return connection;

    } catch (ClassNotFoundException e) {  // Driver não encontrado
        System.out.println("O driver não foi encontrado. " + e.getMessage());
        return null;

    } catch (SQLException e) {
        System.out.println("Não foi possível conectar...");
        e.printStackTrace();  // Adicionar impressão do stack trace para detalhes do erro
        return null;
    }
}
    
    // Retorna a Lista de Produtos(objetos)
    public ArrayList<Funcionario> getMinhaLista() {
        MinhaLista.clear(); 
        System.out.println("Iniciando o carregamento da lista de funcionarios...");
        
        try (Connection conn = this.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet res = stmt.executeQuery("SELECT * FROM tb_funcionarios")) {

            while (res.next()) {
                System.out.println("Carregando produto ID: " + res.getInt("id_funcionarios"));
                int id = res.getInt("id_funcionarios");
                String nomeFuncionario = res.getString("nome_funcionario");
                long telefoneFuncionario = res.getLong("telefone_funcionario");
                String estadoCivil = res.getString("estado_civil");
                long cpfFuncionario = res.getLong("cpf_funcionario");
                String escolariedadeFuncionario = res.getString("escolaridade_funcionario");
                LocalDate dataNascimento = res.getDate("data_nascimentoFun").toLocalDate();
                long cepFuncionario = res.getLong("cep_funcionario");
                String enderecoFuncionario = res.getString("endereco_funcionario");
                String cidadeFuncionario = res.getString("cidade_funcionario");
                int numeroEndereco = res.getInt("numero_endereco");
                String estadoFuncionario = res.getString("estado_funcionario");
                String complementoFuncionario = res.getString("complemento_endereco");
                float salarioFuncionario = res.getFloat("salario_funcionario");
                
                
                System.out.println("Estado Civil: " + estadoCivil + " (tamanho: " + estadoCivil.length() + ")");
                if (estadoCivil.length() > 50) { // ajustar o número conforme o tamanho permitido no banco de dados
                    System.out.println("Erro: o valor de estado_civil é muito longo: " + estadoCivil);
                    continue;
                }
                
                Funcionario objeto2 = new Funcionario( id,telefoneFuncionario, estadoCivil, escolariedadeFuncionario, cepFuncionario, enderecoFuncionario, cidadeFuncionario, numeroEndereco, estadoFuncionario, complementoFuncionario, salarioFuncionario, nomeFuncionario, cpfFuncionario, dataNascimento);
                MinhaLista.add(objeto2);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Funcionarios: " + ex.getMessage());
        }
        System.out.println("Lista de Funcionarios carregada com sucesso. Tamanho da lista: " + MinhaLista.size());
        return MinhaLista;
    } 
    
    public boolean InsertFuncionarioBD(Funcionario objeto) {
    String sql = "INSERT INTO tb_funcionarios(id_funcionarios, nome_funcionario, telefone_funcionario, estado_civil, cpf_funcionario, escolaridade_funcionario, data_nascimentoFun, cep_funcionario, endereco_funcionario, cidade_funcionario, numero_endereco, estado_funcionario, complemento_endereco, salario_funcionario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setLong(3, objeto.getTelefone());
            stmt.setString(4, objeto.getEstado_civil());
            stmt.setLong(5, objeto.getCpf());
            stmt.setString(6, objeto.getEscolariedade());
            LocalDate localDate = objeto.getNascimento();
            stmt.setObject(7, localDate);
            stmt.setLong(8, objeto.getCep());
            stmt.setString(9, objeto.getEndereco());
            stmt.setString(10, objeto.getCidade());
            stmt.setInt(11, objeto.getNumero());
            stmt.setString(12, objeto.getEstado());
            stmt.setString(13, objeto.getComplemento());
            stmt.setFloat(14, objeto.getSalario());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    // Deleta um Produto espec�fico pelo seu campo ID
    public boolean DeleteFuncionarioBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_funcionarios WHERE id_funcionarios = " + id);
            stmt.close();            
        } catch (SQLException erro) {
            
        }
        return true;
    }
    
    public boolean UpdateFuncionarioBD(Funcionario objeto) {

        String sql = "UPDATE tb_funcionarios SET nome_funcionario = ?, telefone_funcionario = ?, estado_civil = ?, cpf_funcionario = ?, escolaridade_funcionario = ?, data_nascimentoFun = ?, cep_funcionario = ?, endereco_funcionario = ?, cidade_funcionario = ?, numero_endereco = ?, estado_funcionario = ?, complemento_endereco = ?, salario_funcionario = ? WHERE id_funcionarios = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setLong(2, objeto.getTelefone());
            stmt.setString(3, objeto.getEstado_civil());
            stmt.setLong(4, objeto.getCpf());
            stmt.setString(5, objeto.getEscolariedade());
            LocalDate localDate = objeto.getNascimento();
            stmt.setObject(6, localDate);
            stmt.setLong(7, objeto.getCep());
            stmt.setString(8, objeto.getEndereco());
            stmt.setString(9, objeto.getCidade());
            stmt.setInt(10, objeto.getNumero());
            stmt.setString(11, objeto.getEstado());
            stmt.setString(12, objeto.getComplemento());
            stmt.setFloat(13, objeto.getSalario());
            stmt.setInt(14, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    // Carrega o produto para exibir
    public Funcionario carregaFuncionario(int id) {
        
        Funcionario objeto = new Funcionario();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_funcionarios WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome_funcionario"));
            
            objeto.setTelefone(res.getLong("telefone_funcionario"));
            
            objeto.setEstado_civil(res.getString("estado_civil")); 
            
            objeto.setCpf(res.getLong("cpf_funcionario")); 
            
            objeto.setEscolariedade(res.getString("escolaridade_funcionario")); 
                    
            LocalDate nascimento = res.getDate("data_nascimentoFun").toLocalDate();
            objeto.setNascimento(nascimento); 
            
            objeto.setCep(res.getLong("cep_funcionario"));  
            
            objeto.setEndereco(res.getString("endereco_funcionario")); 
                    
            objeto.setCidade(res.getString("cidade_funcionario"));    
                    
            objeto.setNumero(res.getInt("numero_endereco"));         
            
            objeto.setEstado(res.getString("estado_funcionario")); 
            
            objeto.setComplemento(res.getString("complemento_endereco")); 
                    
            objeto.setSalario(res.getFloat("salario_funcionario"));         
           
            stmt.close();            
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        return objeto;
    }
    
}
