package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Retangulo extends Quadrilatero {

    private double altura;    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularPerimetro() {
        
        return 2*(getB()+getAltura());
    }

    @Override
    public double calcularArea() {
        
        return getB()*getAltura();
    }
    
    
}
