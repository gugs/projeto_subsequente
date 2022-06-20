package contatos.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBancoDeDados {

	private final String PORTA = "3306";
	private final String USUARIO = "root";
	private final String SENHA = "root!@#";
	private final String ENDERECO_IP = "127.0.0.1";
	private final String DATABASE = "contatos";
	
	public Connection conectarBanco() {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://"+ENDERECO_IP+":"+PORTA+"/"+DATABASE, USUARIO, SENHA);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
