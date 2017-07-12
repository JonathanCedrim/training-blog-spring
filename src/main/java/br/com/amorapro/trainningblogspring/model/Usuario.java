package br.com.amorapro.trainningblogspring.model;

import javax.persistence.*;
import java.util.Base64;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Privilegio privilegio;

    @OneToMany(mappedBy = "usuario")
    private List<Post> posts;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
