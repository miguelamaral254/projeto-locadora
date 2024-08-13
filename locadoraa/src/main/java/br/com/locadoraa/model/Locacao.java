package br.com.locadoraa.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Locacao")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Integer idLocacao;

    @Column(name = "data_locacao", nullable = false)
    private Date dataLocacao;

    @Column(name = "data_prevista", nullable = false)
    private Date dataPrevista;

    @Column(name = "data_devolucao")
    private Date dataDevolucao;

    @Column(name = "multa")
    private Double multa;

    @Column(name = "valor_total", nullable = false)
    private Double valorTotal;

    @Column(name = "form_pag", length = 45)
    private String formPag;

    @ManyToOne
    @JoinColumn(name = "Cliente_cpf", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "Funcionario_cpf", nullable = false)
    private Funcionario funcionario;

    // Construtor padrão
    public Locacao() {
    }
//TODO  REFATORAR RELACOES COM MIDIA!!!!!

    // Construtor com todos os parâmetros
    public Locacao(Integer idLocacao, Date dataLocacao, Date dataPrevista, Date dataDevolucao, Double multa, Double valorTotal, String formPag, Cliente cliente, Funcionario funcionario) {
        this.idLocacao = idLocacao;
        this.dataLocacao = dataLocacao;
        this.dataPrevista = dataPrevista;
        this.dataDevolucao = dataDevolucao;
        this.multa = multa;
        this.valorTotal = valorTotal;
        this.formPag = formPag;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    // Getters e Setters

    public Integer getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(Integer idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormPag() {
        return formPag;
    }

    public void setFormPag(String formPag) {
        this.formPag = formPag;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
