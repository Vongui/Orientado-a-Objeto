package br.ifsp.edu.pep.models;

/**
 *
 * @author aluno
 */
public class Peixe extends Animal{

    @Override
    public void mover() {
        //mover um metro
        System.out.println("Mover classe peixe");
        setX(getX() + 1);
    }
 
    
    
}
