/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Circulo implements FigurasGeometricas {

    private static double pi = 3.14;
    
    
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        return pi*(getBase()*getBase());
    }

    @Override
    public double calcularPerimetro() {
        return 2*getBase()*pi;
    }
    
    
}
