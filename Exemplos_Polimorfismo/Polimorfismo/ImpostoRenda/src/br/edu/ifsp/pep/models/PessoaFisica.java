package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class PessoaFisica extends Pessoa {

    private double saude;
    private double gastoInstrucao;
    private double dependente;

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        if (saude > 5000) {
            this.saude = 5000;
        }
        this.saude = saude;
    }

    public double getGastoInstrucao() {
        return gastoInstrucao;
    }

    public void setGastoInstrucao(double gastoInstrucao) {
        if (gastoInstrucao > 2500) {
            this.gastoInstrucao = 2500;
        }
        this.gastoInstrucao = gastoInstrucao;
    }

    public double getDependente() {
        return dependente;
    }

    public void setDependente(double dependente) {
        if (dependente < 5 && dependente > 0) {
            dependente *= 1500;
            this.dependente = dependente;
        }
        else if (dependente < 0) {
            this.dependente = 0;
        }
        else if(dependente > 4){
            this.dependente = 6000;
        }
    }
    

    @Override
    public double calcularRendaLiquida() {
        double renda;
        renda = getRendaBruta() - (getDependente() + getGastoInstrucao() + getSaude());
        return renda;
    }

    @Override
    public double calcularImposto() {
        double rendaLiquida = calcularRendaLiquida();
        
        if (rendaLiquida <= 10000) {
            return 0;
        }
        else if(rendaLiquida > 10000 && rendaLiquida <= 20000){
            return rendaLiquida * 0.1;
        }
        else if (rendaLiquida > 20000) {
            return rendaLiquida * 0.3;
        }
        return 0;
    }
    
    
    
 
    
    
}
