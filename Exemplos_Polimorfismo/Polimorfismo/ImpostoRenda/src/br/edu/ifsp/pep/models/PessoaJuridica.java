package br.edu.ifsp.pep.models;

/**
 *
 * @author aluno
 */
public class PessoaJuridica extends Pessoa {

    private double gastoPagamento;
    private double gastoEquipamento;

    public double getGastoPagamento() {
        return gastoPagamento;
    }

    public void setGastoPagamento(double gastoPagamento) {
        this.gastoPagamento = gastoPagamento;
    }

    public double getGastoEquipamento() {
        return gastoEquipamento;
    }

    public void setGastoEquipamento(double gastoEquipamento) {
        this.gastoEquipamento = gastoEquipamento;
    }

    @Override
    public double calcularRendaLiquida() {
        double renda;
        renda = (getRendaBruta() - (getGastoEquipamento() + getGastoPagamento()));
        return renda;
    }

    @Override
    public double calcularImposto() {
        double rendaLiquida = calcularRendaLiquida();
        
        if (rendaLiquida <= 100000) {
           return 0.05 * rendaLiquida;
        }
        else if (rendaLiquida >= 100000 && rendaLiquida <= 200000) {
            return 0.1 * rendaLiquida;
        }
        else if (rendaLiquida > 200000) {
            return 0.3 * rendaLiquida;
        }
       return 0;
    }
    
    
    
    
}
