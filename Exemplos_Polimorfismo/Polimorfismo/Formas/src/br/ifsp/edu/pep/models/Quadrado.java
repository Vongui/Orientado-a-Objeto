/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Quadrado extends Quadrilatero {

    @Override
    public double calcularPerimetro() {
        return getB()*4;
    }

    @Override
    public double calcularArea() {
        return getB()*getB();
    }
 
    
}
