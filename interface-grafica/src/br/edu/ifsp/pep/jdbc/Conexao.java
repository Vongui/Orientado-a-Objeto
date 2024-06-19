package br.edu.ifsp.pep.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    
    private final static String URL = "jdbc:mysql://localhost:3306/db_aula?serverTimezone=UTC&serverTimezone=America/Sao_Paulo";
    private final static String USER = "root";
    private final static String PASSWORD = "ifsp";
    
    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
