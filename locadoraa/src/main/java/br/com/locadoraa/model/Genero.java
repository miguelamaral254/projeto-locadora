package br.com.locadoraa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenero")
    private Integer idGenero;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    public Genero(Integer idGenero, String nome) {
        this.idGenero = idGenero;
        this.nome = nome;
    }

    public Genero() {
    }

    // Getters and Setters
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
