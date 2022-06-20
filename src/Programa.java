import javax.swing.SwingUtilities;

import contatos.gui.TelaContato;

public class Programa {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				TelaContato tela = new TelaContato();
			}
		});
	}
}
