package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Passaro extends Animal{
    
    
    @Override
    public void mover() {
        //mover três metro
        System.out.println("Mover classe passaro");
        setX(getX() + 3);
    }
}
