/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Triangulo implements FigurasGeometricas{

    private double altura;
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (getBase()*getAltura())/2;
    }

    @Override
    public double calcularPerimetro() {
        return getBase()*3;
    }
    
    
    
}
