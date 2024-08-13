package br.com.locadoraa.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @Column(name = "CPF", length = 14)
    private String cpf;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;

    @Column(name = "CTPS", nullable = false, length = 20, unique = true)
    private String ctps;

    @Column(name = "email", length = 45, unique = true)
    private String email;

    @Column(name = "data_nasc", nullable = false)
    private java.util.Date dataNasc;

    @Column(name = "data_adm", nullable = false)
    private java.util.Date dataAdm;

    @Column(name = "data_dem")
    private java.util.Date dataDem;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "cargo", nullable = false, length = 45)
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "Endereco_idEndereco", nullable = false)
    private Endereco endereco;

    // Getters and Setters


    public Funcionario(String cpf, String nome, String sexo, String ctps, String email, Date dataNasc, Date dataAdm, Date dataDem, Integer status, String cargo, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.ctps = ctps;
        this.email = email;
        this.dataNasc = dataNasc;
        this.dataAdm = dataAdm;
        this.dataDem = dataDem;
        this.status = status;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public Funcionario() {


    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(Date dataAdm) {
        this.dataAdm = dataAdm;
    }

    public Date getDataDem() {
        return dataDem;
    }

    public void setDataDem(Date dataDem) {
        this.dataDem = dataDem;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}


