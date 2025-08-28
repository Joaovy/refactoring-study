package br.com.alura.domain;

public class Shelter {

    //@JsonProperty("nome")
    private String nome;

    //@JsonProperty("telefone")
    private String telefone;

    private String email;
    private Long id;
    private Pet[] pets;

    public Shelter(){

    }

    public Shelter(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Pet[] getPets() {
        return pets;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
