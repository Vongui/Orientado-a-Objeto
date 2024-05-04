package br.edu.ifsp.pep.modelo;

/**
 * @author Moraes
 */
public class Funcionario {
    int numeroRegistro;
    String nome;
    String cargo;

    public Funcionario(int numeroRegistro, String nome, String cargo) {
        setNumeroRegistro(numeroRegistro);
        setNome(nome);
        setCargo(cargo);
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
