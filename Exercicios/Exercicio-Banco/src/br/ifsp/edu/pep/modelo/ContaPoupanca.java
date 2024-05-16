/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.modelo;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaCorrente{
    
    private double remuneracao;
    
    public ContaPoupanca(String nome, int numeroAgencia, int numeroConta, String email,
    String telefone, double saldo, int dia, int mes, int ano){
        super(nome, numeroAgencia, numeroConta, email, telefone, saldo, dia, mes, ano);
        setRemuneracao(remuneracao);
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }
    
}
