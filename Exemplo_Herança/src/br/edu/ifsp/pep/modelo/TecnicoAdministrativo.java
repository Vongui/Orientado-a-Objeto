package br.edu.ifsp.pep.modelo;

/**
 *
 * @author aluno
 */
public class TecnicoAdministrativo extends Pessoa {

    private String setor;
    private String cargo;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
