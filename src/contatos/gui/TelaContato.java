package contatos.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import contatos.model.Contato;
import contatos.persistencia.ContatosDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaContato extends JFrame{
	
	private JTextField txfNome;
	private JTextField txfEmail;
	private JTextField txfTelefone;
	private JLabel lblNome;
	private JLabel lblNewLabel;
	private JLabel lblTelefone;
	private JButton btnSalvar;
	
	public TelaContato() {
		
		setSize(341, 300);
		setTitle("Minha Agenda");
		setResizable(false);
		getContentPane().setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 32, 46, 14);
		getContentPane().add(lblNome);
		
		txfNome = new JTextField();
		txfNome.setBounds(65, 29, 234, 20);
		getContentPane().add(txfNome);
		txfNome.setColumns(10);
		
		lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setBounds(10, 81, 46, 14);
		getContentPane().add(lblNewLabel);
		
		txfEmail = new JTextField();
		txfEmail.setBounds(65, 78, 234, 20);
		getContentPane().add(txfEmail);
		txfEmail.setColumns(10);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 131, 46, 14);
		getContentPane().add(lblTelefone);
		
		txfTelefone = new JTextField();
		txfTelefone.setBounds(65, 128, 234, 20);
		getContentPane().add(txfTelefone);
		txfTelefone.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 196, 89, 45);
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ContatosDAO.pegarInstancia().adicionarContato(new Contato(0, txfNome.getText(), txfEmail.getText(), txfTelefone.getText()));
				JOptionPane.showMessageDialog(null, "O contato foi salvo com sucesso!");
			}
		});
		getContentPane().add(btnSalvar);
	}
}
