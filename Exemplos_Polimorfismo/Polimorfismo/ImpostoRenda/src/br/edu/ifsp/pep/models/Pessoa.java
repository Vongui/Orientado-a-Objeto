package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public abstract class Pessoa {
    
    private double rendaBruta;
//    private double rendaLiquida;

    public Pessoa() {
    }

    public Pessoa(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

//    public double getRendaLiquida() {
//        return rendaLiquida;
//    }
//
//    public void setRendaLiquida(double rendaLiquida) {
//        this.rendaLiquida = rendaLiquida;
//    }
    
    public abstract double calcularRendaLiquida();
    
    public abstract double calcularImposto();
}
