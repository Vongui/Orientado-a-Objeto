/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep;

import br.ifsp.edu.pep.models.FigurasGeometricas;
import br.ifsp.edu.pep.models.Quadrado;
import br.ifsp.edu.pep.models.Retangulo;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Main {
    
    private static ArrayList<FigurasGeometricas> formas = new ArrayList<>();
    
    public static void main(String[] args) {
        adicionarQuadrado();
        adicionarRetangulo();
        
        apresentarArea();
        apresentarPerimetro();
    }

    private static void adicionarQuadrado() {
        Quadrado q = new Quadrado();
        q.setB(2);
        formas.add(q);
    }

    private static void adicionarRetangulo() {
        Retangulo r = new Retangulo();
        r.setAltura(2);
        r.setB(3);
        formas.add(r);
    }
    
    private static void apresentarArea(){
        for (FigurasGeometricas forma : formas) {
            if (forma instanceof Quadrado q) {
                System.out.println("Area quadrado: "+q.calcularArea());
            }
            if (forma instanceof Retangulo r) {
                System.out.println("Area retângulo: "+r.calcularArea());
            }
        }
    }
    
    private static void apresentarPerimetro(){
        for (FigurasGeometricas forma : formas) {
            if (forma instanceof Quadrado q) {
                System.out.println("Perimetro Quadrado: " + q.calcularPerimetro());
            }
            if (forma instanceof Retangulo r) {
                System.out.println("Perimetro Retângulo: "+ r.calcularPerimetro());
            }
        }
    }
}
