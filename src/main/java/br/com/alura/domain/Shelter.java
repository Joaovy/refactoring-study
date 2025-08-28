package br.com.alura.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Abrigo {

    //@JsonProperty("nome")
    private String nome;

    //@JsonProperty("telefone")
    private String telefone;

    private String email;
    private Long id;
    private Pet[] pets;

    public Abrigo(){

    }

    public Abrigo(String nome, String telefone, String email) {
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
