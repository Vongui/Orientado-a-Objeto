/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.modelo;

/**
 *
 * @author aluno
 */
public class ContaCorrente {
   
    private String nome;
    private int numeroAgencia;
    private int numeroConta;
    private String email;
    private String telefone;
    private double saldo;
    private int dia;
    private int mes;
    private int ano;
    
    public ContaCorrente(String nome, int numeroAgencia, int numeroConta, String email,
    String telefone, double saldo, int dia, int mes, int ano){
        setNome(nome);
        setNumeroAgencia(numeroAgencia);
        setNumeroConta(numeroConta);
        setEmail(email);
        setTelefone(telefone);
        setSaldo(saldo);
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void sacar(double valor){
        
        if (getSaldo() >= valor  && (getSaldo()+valor) >= getSaldo()) {
            saldo = getSaldo() - valor;
            setSaldo(saldo);
        }
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
}
