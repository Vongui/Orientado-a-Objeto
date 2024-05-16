/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.modelo;

/**
 *
 * @author aluno
 */
public class ContaCorrenteEspecial extends ContaCorrente{
    
    private double limite = 1000;
    
    public ContaCorrenteEspecial(String nome, int numeroAgencia, int numeroConta, String email,
    String telefone, double saldo, int dia, int mes, int ano){
        super(nome, numeroAgencia, numeroConta, email, telefone, saldo, dia, mes, ano);
        setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void sacarEspecial(double valor){
        if ((getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
        }
    }
}
