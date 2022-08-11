package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame {
	
	public MarcoCombo() {
		setBounds(550,300,550,400);
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
		setVisible(true);
	}
	
}

class LaminaCombo extends JPanel {
	
	private JLabel texto;
	private JComboBox micombo;
	
	public LaminaCombo() {
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		JPanel lamina_norte = new JPanel();
		micombo = new JComboBox();
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		micombo.setEditable(true);
		Evento_combo mieventoCombo = new Evento_combo();
		micombo.addActionListener(mieventoCombo);
		lamina_norte.add(micombo);
		add(lamina_norte, BorderLayout.NORTH);
	}
	
	private class Evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font(micombo.getSelectedItem().toString(), Font.PLAIN, 18));
		}
		
	}
	
	
}