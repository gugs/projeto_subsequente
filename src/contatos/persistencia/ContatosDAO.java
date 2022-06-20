package contatos.persistencia;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import contatos.model.Contato;

public class ContatosDAO {

	ConectorBancoDeDados conector;
	static ContatosDAO instancia;
	
	private ContatosDAO() {
		// TODO Auto-generated constructor stub
		conector = new ConectorBancoDeDados();
	}
	
	public static ContatosDAO pegarInstancia() {
		if(instancia != null)
			return instancia;
		else
			return new ContatosDAO();
	}
	
	public void adicionarContato(Contato c) {
		Connection conn = conector.conectarBanco();
		try {
			PreparedStatement pst = conn.prepareStatement("INSERT INTO CONTATO VALUES (?, ?, ?, ?);");
			pst.setInt(1, c.getId());
			pst.setString(2, c.getNome());
			pst.setString(3, c.getEmail());
			pst.setString(4, c.getTelefone());
			pst.execute();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void atualizarContato() {
		
	}
	
	public void removerContato() {
		
	}
	
	public void localizarContato() {
		
	}
}
