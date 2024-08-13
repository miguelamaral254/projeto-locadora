package br.com.locadoraa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTelefone")
    private Integer idTelefone;

    @Column(name = "numero", length = 11)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "Cliente_CPF")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "Funcionario_CPF")
    private Funcionario funcionario;

    public Telefone() {
    }

    public Telefone(Integer idTelefone, String numero, Cliente cliente, Funcionario funcionario) {
        this.idTelefone = idTelefone;
        this.numero = numero;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    // Getters and Setters


    public Integer getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Integer idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
