package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public abstract class Quadrilatero {
    
    private double b;
    

    public Quadrilatero() {
    }

    public Quadrilatero(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();

}
