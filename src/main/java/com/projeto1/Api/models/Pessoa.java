package com.projeto1.Api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "O nome não pode ser vazio")
    private String nome;

    @Column(name = "email", unique = true)
    @NotBlank(message = "O e-mail não pode ser vazio")
    @Email(message = "E-mail inválido")
    private String email;

    private int idade;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos");
        }
        this.idade = idade;
    }
}
