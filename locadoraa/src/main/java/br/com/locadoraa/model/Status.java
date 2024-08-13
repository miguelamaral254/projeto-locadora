package br.com.locadoraa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStatus")
    private Integer idStatus;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    public Status(Integer idStatus, String nome) {
        this.idStatus = idStatus;
        this.nome = nome;
    }

    public Status() {
    }
    // Getters and Setters


    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
