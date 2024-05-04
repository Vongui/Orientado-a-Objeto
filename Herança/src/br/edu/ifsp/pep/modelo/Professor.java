package br.edu.ifsp.pep.modelo;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa {

    private String area;
    private String tipoContrato;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
}
