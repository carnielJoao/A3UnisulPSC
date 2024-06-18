package Model;

import java.time.LocalDate;

public abstract class Pessoa {

    // Atributos
    
    int id;
    private String nome;
    private long cpf;
    private LocalDate nascimento;
  

    // Metodo Construtor de Objeto Vazio
    public Pessoa() {
    }

    // Metodo Construtor de Objeto, inserindo dados

    public Pessoa(String nome, long cpf, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    
    public Pessoa(int id, String nome, long cpf, LocalDate nascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
   
    // M�todos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
   
}
