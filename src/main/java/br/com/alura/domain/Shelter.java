package br.com.alura.domain;

public class Shelter {

    private String name;
    private String phone;
    private String email;
    private Long id;


    public Shelter(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return name;
    }
}
