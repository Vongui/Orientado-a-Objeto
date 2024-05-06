package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Anfibio extends Animal{
 
    
    @Override
    public void mover() {
        //mover um metro e meio
        System.out.println("Mover classe anfibio");
        setX(getX() + 1.5);
    }
}
