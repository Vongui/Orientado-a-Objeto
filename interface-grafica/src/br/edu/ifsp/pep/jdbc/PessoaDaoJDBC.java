package br.edu.ifsp.pep.jdbc;

import br.edu.ifsp.pep.dao.DAO;
import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class PessoaDaoJDBC implements DAO {

    @Override
    public void adicionar(Pessoa pessoa) {

        String sql = "insert into "
                + "pessoa(nome, data_nascimento, email, "
                + "endereco, salario, telefone) "
                + "values (?, ?, ?, ?, ?, ?)";

        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());

            java.sql.Date dataNascimento
                    = new java.sql.Date(pessoa.getDataNascimento().getTime());
            ps.setDate(2, dataNascimento);

            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getEndereco());
            ps.setDouble(5, pessoa.getSalario());
            ps.setString(6, pessoa.getTelefone());

            //Executa a instrução SQL
            ps.execute();

            //Fecha o Prepare Statement
            ps.close();
            //Fecha a conexão com o BD
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private List<Pessoa> consultar(PreparedStatement ps) {
        List<Pessoa> pessoas = new ArrayList();
        try {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pessoa p = new Pessoa();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                p.setDataNascimento(rs.getDate("data_nascimento"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setSalario(rs.getDouble("salario"));
                p.setTelefone(rs.getString("telefone"));

                pessoas.add(p);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pessoas;
    }
    
    public List<Pessoa> consulta(String sql) {

        Connection conexao = Conexao.getConexao();
        List<Pessoa> pessoas = new ArrayList();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pessoa p = new Pessoa();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                p.setDataNascimento(rs.getDate("data_nascimento"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setSalario(rs.getDouble("salario"));
                p.setTelefone(rs.getString("telefone"));

                pessoas.add(p);

            }

            ps.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pessoas;
    }

    @Override 
    public List<Pessoa> getTodos(){
        //Fazer uma consulta SQL (Select)
        String sql = "select * from pessoa";
        return consulta(sql);
    }
    
    @Override
    public void remover(int codigo) throws Exception {
        String sql = "delete from pessoa p where p.codigo = ?";

        Connection conexao = Conexao.getConexao();

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);

        ps.execute();

        ps.close();
        conexao.close();
    }

    @Override
    public void alterar(Pessoa pessoa) throws Exception {
        String sql = "update pessoa "
                + "set nome = ?, data_nascimento = ?, "
                + "email = ?, endereco = ?, salario = ?,"
                + "telefone = ? "
                + "where codigo = ?";

        Connection conexao = Conexao.getConexao();

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, pessoa.getNome());
        ps.setDate(2, new java.sql.Date(pessoa.getDataNascimento().getTime()));
        ps.setString(3, pessoa.getEmail());
        ps.setString(4, pessoa.getEndereco());
        ps.setDouble(5, pessoa.getSalario());
        ps.setString(6, pessoa.getTelefone());
        ps.setInt(7, pessoa.getCodigo());

        ps.execute();

        ps.close();
        conexao.close();

    }

    @Override
    public List<Pessoa> getPessoasOrdenadasPeloNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pessoa getPessoa(int codigo) throws Exception {
        //Fazer uma consulta SQL (Select)
        String sql = "select * from pessoa p where p.codigo = ?";

        Connection conexao = Conexao.getConexao();
        Pessoa pessoa = null;
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                pessoa = new Pessoa();
                pessoa.setCodigo(rs.getInt("codigo"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setDataNascimento(rs.getDate("data_nascimento"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setSalario(rs.getDouble("salario"));
                pessoa.setTelefone(rs.getString("telefone"));

            }

            ps.close();
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pessoa;
    }

    public List<Pessoa> consultarPeloNome(String nome) {
    String sql = "select * from pessoa p where p.nome LIKE ?";
   
    List<Pessoa> pessoas = new ArrayList<>();

    
    Connection conexao = Conexao.getConexao();
    PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            pessoas = consultar(ps);
            
            ps.close();
            conexao.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    return pessoas;
    }

}