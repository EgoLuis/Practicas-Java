package ProcesadorTextoEjercicio;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.*;

public class LaminaProcesadorIII extends JPanel {
	
	JTextPane miarea;
	JMenu fuente, estilo, tamagno;
	Font letras;
	
	public LaminaProcesadorIII() {
		
		setLayout(new BorderLayout());
		JPanel laminamenu = new JPanel();
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		JMenuBar mibarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tama�o");
			
		configuraMenu("Arial", "fuente", "Arial", 9, 10);
		configuraMenu("Courier", "fuente", "Courier", 9, 10);
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10);	
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 10);
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 10);
		
		configuraMenu("12", "tama�o", "", 9, 12);
		configuraMenu("16", "tama�o", "", 9, 16);
		configuraMenu("20", "tama�o", "", 9, 20);
		configuraMenu("24", "tama�o", "", 9, 24);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		if(menu.equals("fuente")) {
			fuente.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", tipoLetra));
			
		} else if (menu.equals("estilo")) {
			estilo.add(elem_menu);
			if(estilos==Font.BOLD) elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			else if (estilos==Font.ITALIC) elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			
		} else if(menu.equals("tama�o")) {
			tamagno.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o", tam));
		}

	}
	
	
	
}








