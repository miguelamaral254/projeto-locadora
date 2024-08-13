    package br.com.locadoraa.model;

    import jakarta.persistence.*;

    import java.util.Date;


    @Entity
    @Table(name = "Cliente")
    public class Cliente {

        @Id
        @Column(name = "CPF", length = 14)
        private String cpf;

        @Column(name = "nome", nullable = false, length = 45)
        private String nome;

        @Column(name = "sexo", nullable = false, length = 1)
        private String sexo;

        @Column(name = "data_nasc", nullable = false)
        private java.util.Date dataNasc;

        @Column(name = "email", length = 45, unique = true)
        private String email;

        @ManyToOne
        @JoinColumn(name = "Endereco_idEndereco", nullable = false)
        private Endereco endereco;

        public Cliente() {
        }

    // Getters and Setters

        public Cliente(String cpf, String nome, String sexo, Date dataNasc, String email, Endereco endereco) {
            this.cpf = cpf;
            this.nome = nome;
            this.sexo = sexo;
            this.dataNasc = dataNasc;
            this.email = email;
            this.endereco = endereco;
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

        public Date getDataNasc() {
            return dataNasc;
        }

        public void setDataNasc(Date dataNasc) {
            this.dataNasc = dataNasc;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
    }
