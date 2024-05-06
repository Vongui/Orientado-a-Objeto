package br.ifsp.edu.pep;

import br.ifsp.edu.pep.models.Anfibio;
import br.ifsp.edu.pep.models.Animal;
import br.ifsp.edu.pep.models.Passaro;
import br.ifsp.edu.pep.models.Peixe;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Main {
    
    private static ArrayList<Animal> animais = new ArrayList<>();
    
    public static void main(String[] args) {
        
        adicionarPeixe(10.0, 10.0);
        adicionarPeixe(20.0, 10.0);
        adicionarPeixe(30.0, 10.0);
        
        adicionarAnfibio(100, 100);
        adicionarAnfibio(200, 100);
        
        adicionarPassaro(500, 500);
        
        movimentar();
        
    }

    private static void adicionarPeixe(double x, double y) {
        Peixe p = new Peixe();
        p.setX(x);
        p.setY(y);
        
        animais.add(p);
    }
    
    private static void adicionarPassaro(double x, double y) {
        Passaro p = new Passaro();
        p.setX(x);
        p.setY(y);
        
        animais.add(p);
    }
    
    private static void adicionarAnfibio(double x, double y) {
        Anfibio a = new Anfibio();
        a.setX(x);
        a.setY(y);
        
        animais.add(a);
    }

    private static void movimentar() {
        for (Animal animal : animais) {
            animal.mover();
            //System.out.println(animal.toString());
        }
    }
    
    
}
