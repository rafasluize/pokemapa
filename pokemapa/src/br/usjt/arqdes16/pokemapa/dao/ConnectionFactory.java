package br.usjt.arqdes16.pokemapa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConexao() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost/mapeamento?user=alunos&password=alunos");
	}
}
