package ProcesadorTextoEjercicio;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaminaProcesadorII extends JPanel {
	
	JTextPane miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
	
	public LaminaProcesadorII() {
		
		setLayout(new BorderLayout());
		JPanel laminamenu = new JPanel();
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		JMenuBar mibarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");
			
		configuraMenu("Arial", "fuente", "Arial", 9, 10);
		configuraMenu("Courier", "fuente", "Courier", 9, 10);
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10);	
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 10);
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 10);
		
		configuraMenu("12", "tamaño", "", 9, 12);
		configuraMenu("16", "tamaño", "", 9, 16);
		configuraMenu("20", "tamaño", "", 9, 20);
		configuraMenu("24", "tamaño", "", 9, 24);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		JMenuItem elem_menu = new JMenuItem(rotulo);
		if(menu.equals("fuente")) fuente.add(elem_menu);
		else if (menu.equals("estilo")) estilo.add(elem_menu);
		else if(menu.equals("tamaño")) tamagno.add(elem_menu);

		elem_menu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));
	}
	
	
	private class GestionaEventos implements ActionListener{

		String tipo_texto, menu;
		int estilo_letra, tamagno_letra;
		
		GestionaEventos(String elemento, String texto2, int estilo2, int tam_letra){
			tipo_texto = texto2;
			estilo_letra = estilo2;
			tamagno_letra = tam_letra;
			menu = elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras = miarea.getFont();
			
			if(menu.equals("Arial") || menu.equals("Courier") || menu.equals("Verdana")) {
				
				estilo_letra = letras.getStyle();
				tamagno_letra = letras.getSize();
				
			} else if(menu.equals("Cursiva") || menu.equals("Negrita")) {
				if(letras.getStyle() == 1 || letras.getStyle() == 2) estilo_letra = 3;
				tipo_texto = letras.getFontName();
				tamagno_letra = letras.getSize();
				
			} else if (menu.equals("12") || menu.equals("16") || menu.equals("20") || menu.equals("24")){
				tipo_texto = letras.getFontName();
				estilo_letra = letras.getStyle();
			}
			
			miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));
		}
		
	}
	
}








