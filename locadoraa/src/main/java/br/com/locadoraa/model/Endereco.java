package br.com.locadoraa.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEndereco")
    private Integer idEndereco;

    @Column(name = "UF", nullable = false, length = 2)
    private String uf;

    @Column(name = "cidade", nullable = false, length = 45)
    private String cidade;

    @Column(name = "bairro", nullable = false, length = 45)
    private String bairro;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "rua", nullable = false, length = 45)
    private String rua;

    @Column(name = "comp", length = 45)
    private String comp;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    // Getters and Setters


    public Endereco() {
    }

    public Endereco(Integer idEndereco, String uf, String cidade, String bairro, Integer numero, String rua, String comp, String cep) {
        this.idEndereco = idEndereco;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
        this.comp = comp;
        this.cep = cep;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}

