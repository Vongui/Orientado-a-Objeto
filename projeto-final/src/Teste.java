
import br.edu.ifsp.pep.jdbc.Conexao;


/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        if (Conexao.getConexao() == null) {
            System.out.println("Falhou...");
        } else {
            System.out.println("Conectou...");
        }
    }
}
