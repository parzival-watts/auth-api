package io.github.parzival.authapi.models;

import io.github.parzival.authapi.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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

    private RoleEnum role;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

}
