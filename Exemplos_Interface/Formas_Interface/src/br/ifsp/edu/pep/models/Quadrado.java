/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Quadrado implements FigurasGeometricas{

    private double base;
    
    public double getBase() {
        return base;
    }

    public void setB(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularPerimetro() {
        return getBase()*4;
    }

    @Override
    public double calcularArea() {
        return getBase()*getBase();
    }
 
    
    
}
