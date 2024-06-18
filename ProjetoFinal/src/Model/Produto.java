package Model;

import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Produto {
    
    // Atributos
    private int id;
    private String nomeProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private float precoProduto;
    private LocalDate dataCadastro;
    private String categoriaProduto;
    private String editoraProduto;
    private String autorProduto;
    private int anoLancamento;
    
    private final ProdutoDAO dao;
    
    // Construtor de Objeto Vazio
    public Produto() {
        this.dao = new ProdutoDAO();
    }
    
    // Construtor de Objeto Inserindo Dados
    public Produto(int id, String nomeProduto, String descricaoProduto, int quantidadeProduto, float precoProduto, LocalDate dataCadastro, String categoriaProduto, String editoraProduto, String autorProduto, int anoLancamento) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        this.dataCadastro = dataCadastro;
        this.categoriaProduto = categoriaProduto;
        this.editoraProduto = editoraProduto;
        this.autorProduto = autorProduto;
        this.anoLancamento = anoLancamento;
        this.dao = new ProdutoDAO();
    }

    private Produto(int id, String nomeProduto, String descricaoProduto, int quantidadeProduto, float precoProduto, String categoriaProduto, String editoraProduto, String autorProduto, int anoLancamento) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.editoraProduto = editoraProduto;
        this.autorProduto = autorProduto;
        this.anoLancamento = anoLancamento;
        this.dao = new ProdutoDAO();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getEditoraProduto() {
        return editoraProduto;
    }

    public void setEditoraProduto(String editoraProduto) {
        this.editoraProduto = editoraProduto;
    }

    public String getAutorProduto() {
        return autorProduto;
    }

    public void setAutorProduto(String autorProduto) {
        this.autorProduto = autorProduto;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
        
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }
    
    // Cadastra novo Produto
    public boolean InsertProdutoBD(String nomeProduto, String descricaoProduto, int quantidadeProduto, float precoProduto, LocalDate dataCadastro, String categoriaProduto, String editoraProduto, String autorProduto, int anoLancamento) throws SQLException {
        Produto objeto = new Produto(id, nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, dataCadastro, categoriaProduto, editoraProduto, autorProduto, anoLancamento);
        dao.InsertProdutoBD(objeto);
        return true;
    }

    // Deleta um Produto especifico pelo seu campo ID
    public boolean DeleteProdutoBD(int id) {
        dao.DeleteProdutoBD(id);
        return true;
    }
    
    // Altera o produto
    public boolean UpdateProdutoBD(int id, String nomeProduto, String descricaoProduto, int quantidadeProduto, float precoProduto, String categoriaProduto, String editoraProduto, String autorProduto, int anoLancamento) {
        Produto objeto = new Produto(id, nomeProduto, descricaoProduto, quantidadeProduto, precoProduto, categoriaProduto, editoraProduto, autorProduto, anoLancamento);
        dao.UpdateProdutoBD(objeto);
        return true;
    }
}
