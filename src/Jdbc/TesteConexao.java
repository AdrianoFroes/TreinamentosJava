package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:oracle:/host:100.0.65.106";
		final String usuario = "adriano";
		final String senha = "sis";
	
		Connection conexao = DriverManager.getConnection(url,usuario,senha);
		
		System.out.println("Conexao efetuaa com sucesso");
		conexao.close();
		
	}

}
