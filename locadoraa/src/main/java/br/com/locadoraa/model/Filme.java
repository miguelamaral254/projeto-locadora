package br.com.locadoraa.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "Filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_filme")
    private Integer idFilme;

    @Column(name = "titulo_original", nullable = false, length = 80)
    private String tituloOriginal;

    @Column(name = "titulopt", length = 80)
    private String tituloPT;

    @Column(name = "preco", nullable = false)
    private Double preco; // Removido precision e scale

    @Column(name = "duracao", nullable = false)
    private Time duracao;

    @Column(name = "ano", nullable = false)
    private Integer ano;

    @Column(name = "faixa_etaria", nullable = false, length = 5)
    private String faixaEtaria;

    // Construtores, Getters e Setters

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPT() {
        return tituloPT;
    }

    public void setTituloPT(String tituloPT) {
        this.tituloPT = tituloPT;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
