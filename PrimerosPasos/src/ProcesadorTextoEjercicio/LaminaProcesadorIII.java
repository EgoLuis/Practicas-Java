package ProcesadorTextoEjercicio;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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
		tamagno = new JMenu("Tamaño");
			
		configuraMenu("Arial", "fuente", "Arial", 9, 10,"");
		configuraMenu("Courier", "fuente", "Courier", 9, 10,"");
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10,"");	
		
//		configuraMenu("Negrita", "estilo", "", Font.BOLD, 10,"bin/graficos/bola_amarilla.gif");
//		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 10,"bin/graficos/bola_amarilla.gif");
		
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("bin/graficos/bola_amarilla.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("bin/graficos/bola_amarilla.gif"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		estilo.add(negrita);
		estilo.add(cursiva);
		
		
//		configuraMenu("12", "tamaño", "", 9, 12,"");
//		configuraMenu("16", "tamaño", "", 9, 16,"");
//		configuraMenu("20", "tamaño", "", 9, 20,"");
//		configuraMenu("24", "tamaño", "", 9, 24,"");
		
		ButtonGroup tamano_letra = new ButtonGroup();
		JRadioButtonMenuItem tam12 = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem tam16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem tam20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem tam24 = new JRadioButtonMenuItem("24");
		tamano_letra.add(tam12);
		tamano_letra.add(tam16);
		tamano_letra.add(tam20);
		tamano_letra.add(tam24);
		tam12.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 12));
		tam16.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 16));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 20));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 24));
		
		tamagno.add(tam12);
		tamagno.add(tam16);
		tamagno.add(tam20);
		tamagno.add(tam24);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);
		miarea.setComponentPopupMenu(emergente);
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String ruta_icono) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		if(menu.equals("fuente")) {
			fuente.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", tipoLetra));
			
		} else if (menu.equals("estilo")) {
			estilo.add(elem_menu);
			if(estilos==Font.BOLD) elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			else if (estilos==Font.ITALIC) elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			
		} else if(menu.equals("tamaño")) {
			tamagno.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", tam));
		}

	}
	
		
}








