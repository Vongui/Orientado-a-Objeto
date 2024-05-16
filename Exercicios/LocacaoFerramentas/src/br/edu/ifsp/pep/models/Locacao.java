package br.edu.ifsp.pep.models;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Locacao {
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private double valorDiaria;
    private Cliente cliente;
    private Funcionario funcionario;

    public Locacao(LocalDate dataLocacao, LocalDate dataDevolucao, double valorDiaria, Cliente cliente, Funcionario funcionario) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorDiaria = valorDiaria;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
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
