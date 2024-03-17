package io.github.parzival.authapi.models;

import jakarta.persistence.*;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nome;
    @Column
    private String login;
    @Column
    private String senha;

    public Usuario(){

    }

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
