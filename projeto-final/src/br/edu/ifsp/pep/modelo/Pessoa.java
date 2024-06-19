package br.edu.ifsp.pep.modelo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa implements Comparable<Pessoa> {

    private int codigo; //autoincrement
    private String nome;
    private Date dataNascimento;
    private String email;
    private String endereco;
    private double salario;
    private String telefone;
//    private String login;
//    private String senha;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNascimento, String email, String endereco, double salario, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email + ", endereco=" + endereco + ", salario=" + salario + ", telefone=" + telefone + '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.compareTo(pessoa);
    }

}
