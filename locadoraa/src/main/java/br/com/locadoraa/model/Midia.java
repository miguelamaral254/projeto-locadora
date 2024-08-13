package br.com.locadoraa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Midia")
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMidia")
    private Integer idMidia;

    @Column(name = "tipo", nullable = false, length = 45)
    private String tipo;

    @Column(name = "secao", nullable = false, length = 45)
    private String secao;

    @Column(name = "local", nullable = false, length = 45)
    private String local;

    @ManyToOne
    @JoinColumn(name = "Status_idStatus", nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "Filme_idFilme", nullable = false)
    private Filme filme;

    public Midia(Integer idMidia, String tipo, String secao, String local, Status status, Filme filme) {
        this.idMidia = idMidia;
        this.tipo = tipo;
        this.secao = secao;
        this.local = local;
        this.status = status;
        this.filme = filme;
    }

    public Midia() {
    }

// Getters and Setters


    public Integer getIdMidia() {
        return idMidia;
    }

    public void setIdMidia(Integer idMidia) {
        this.idMidia = idMidia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
