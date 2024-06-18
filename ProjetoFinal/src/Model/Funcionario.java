package Model;

import DAO.FuncionarioDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    
    private long telefone;
    private String estado_civil;
    private String escolariedade;
    private long cep;
    private String endereco;
    private String cidade;
    private int numero;
    private String estado;
    private String complemento;
    private float salario;
    
    private final FuncionarioDAO dao; 
    
    public Funcionario() {
        this.dao = new FuncionarioDAO(); // inicializado n�o importa em qual construtor
    }

    

    public Funcionario(long telefone, String estado_civil, String escolariedade, long cep, String endereco, String cidade, int numero, String estado, String complemento, float salario, String nome, long cpf, LocalDate nascimento) {
        super( nome, cpf, nascimento);
        this.telefone = telefone;
        this.estado_civil = estado_civil;
        this.escolariedade = escolariedade;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.complemento = complemento;
        this.salario = salario;
        this.dao = new FuncionarioDAO();
    }
    
    public Funcionario(int id, long telefone, String estado_civil, String escolariedade, long cep, String endereco, String cidade, int numero, String estado, String complemento, float salario, String nome, long cpf, LocalDate nascimento) {
        super( id, nome, cpf, nascimento);
        this.telefone = telefone;
        this.estado_civil = estado_civil;
        this.escolariedade = escolariedade;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.complemento = complemento;
        this.salario = salario;
        this.dao = new FuncionarioDAO();
    }
    
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }
    
    
     
    
    // Cadastra novo Funcionario
    public boolean InsertFuncionarioBD( long telefone, 
                                        String estado_civil,  
                                        String escolariedade,  
                                        long cep, 
                                        String endereco, 
                                        String cidade, 
                                        int numero, 
                                        String estado, 
                                        String complemento, 
                                        float salario,
                                        String nome,
                                        long cpf,
                                        LocalDate nascimento) 
                                throws SQLException {
                                    Funcionario objeto = new Funcionario(
                                        telefone, 
                                        estado_civil, 
                                        escolariedade, 
                                        cep, 
                                        endereco, 
                                        cidade, 
                                        numero, 
                                        estado, 
                                        complemento, 
                                        salario, 
                                        nome, 
                                        cpf, 
                                        nascimento);
                                        dao.InsertFuncionarioBD(objeto);
                                    return true;
                                }

    // Deleta um Produto especifico pelo seu campo ID
    public boolean DeleteFuncionarioBD(int id) {
        dao.DeleteFuncionarioBD(id);
        return true;
    }
    
    // Altera o produto
    public boolean UpdateFuncionarioBD( int id,
                                        long telefone, 
                                        String estado_civil,  
                                        String escolariedade,  
                                        long cep, 
                                        String endereco, 
                                        String cidade, 
                                        int numero, 
                                        String estado, 
                                        String complemento, 
                                        float salario,
                                        String nome,
                                        long cpf,
                                        LocalDate nascimento)  
                                throws SQLException {
                                    Funcionario objeto = new Funcionario(
                                        id,
                                        telefone, 
                                        estado_civil, 
                                        escolariedade, 
                                        cep, 
                                        endereco, 
                                        cidade, 
                                        numero, 
                                        estado, 
                                        complemento, 
                                        salario, 
                                        nome, 
                                        cpf, 
                                        nascimento);
                                        dao.UpdateFuncionarioBD(objeto);
                                    return true;
                                }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getEscolariedade() {
        return escolariedade;
    }

    public void setEscolariedade(String escolariedade) {
        this.escolariedade = escolariedade;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
