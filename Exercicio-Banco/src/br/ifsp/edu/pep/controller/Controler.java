/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.controller;

import br.ifsp.edu.pep.modelo.ContaCorrente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author aluno
 */
public class Controler {
    
    private ArrayList<ContaCorrente> gerenciador = new ArrayList<>();
    private Scanner leia = new Scanner(System.in);
    
    
    public int validarConta(int numeroAgencia, int numeroConta){
        for (ContaCorrente contaCorrente : gerenciador) {
            if (numeroAgencia == contaCorrente.getNumeroAgencia()) {
                if (numeroConta == contaCorrente.getNumeroConta()) {
                    return 0;
                }
            }
        }
        return 1;
    }
    
    
    public ArrayList<ContaCorrente> getContas(){
        return gerenciador;
    }
    
    public void addConta(ContaCorrente conta){
        this.gerenciador.add(conta);
    }
    
    public ContaCorrente pesquisar(int numeroAgencia, int numeroConta){
        for (ContaCorrente contaCorrente : gerenciador) {
            if (numeroAgencia == contaCorrente.getNumeroAgencia()) {
                if (numeroConta == contaCorrente.getNumeroConta()) {
                    return contaCorrente;
                }
            }
        }
        return null;
    }
    
    public double transferirValor(int numeroAtual, int agenciaAtual, double valorAtual, int numeroDestino, int agenciaDestino) {
        ContaCorrente contaOrigem = null;
        ContaCorrente contaDestino = null;

        for (ContaCorrente conta : gerenciador) {
            if (conta.getNumeroConta() == numeroAtual && conta.getNumeroAgencia() == agenciaAtual) {
                contaOrigem = conta;
            }
            if (conta.getNumeroConta() == numeroDestino && conta.getNumeroAgencia() == agenciaDestino) {
                contaDestino = conta;
            }
        }

        if (contaOrigem == null || contaDestino == null) {
            return -1;
        }

        if (valorAtual > contaOrigem.getSaldo()) {
            return -2;
        }

        double dinheiro = contaOrigem.getSaldo();
        double transferido = contaDestino.getSaldo();
        dinheiro -= valorAtual;
        contaOrigem.setSaldo(dinheiro);
        transferido += valorAtual;
        contaDestino.setSaldo(transferido);

        return contaOrigem.getSaldo();
    }
}
