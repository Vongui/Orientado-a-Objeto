package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Retangulo implements FigurasGeometricas{

    private double altura;   
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setB(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularPerimetro() {
        
        return 2*(getBase()+getAltura());
    }

    @Override
    public double calcularArea() {
        
        return getBase()*getAltura();
    }
    
    
}
