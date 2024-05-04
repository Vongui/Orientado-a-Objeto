package br.edu.ifsp.pep.modelo;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {
    private String curso;
    private int semestre;
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
