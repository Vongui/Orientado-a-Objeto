package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public abstract class Animal {
    /**
     * Se utiliza quando todas as subclasses precisem de um metodo e que na superclasse
     * será abstrata pois não há subsidios suficientes para implementar
     * 
     * Classe abstrata -> não pode ser instanciada, pode ter metodos abstratos 
     */
    
    private double x;
    private double y;

    public Animal() {
    }
    
    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** 
     * obriga a todas as classes filhas a terem o metodo mover 
     * metodo abstrato
     */
    public abstract void mover(); 
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
