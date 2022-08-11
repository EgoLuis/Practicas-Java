package graficos;

import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame mimarco = new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MenuFrame extends JFrame{
	
	public MenuFrame() {
		setBounds(500,300,550,400);
		add(new MenuLamina());
		setVisible(true);
	}
}


class MenuLamina extends JPanel {
	
	public MenuLamina() {
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu subOpciones = new JMenu("Opciones");
		
		subOpciones.add(new JMenuItem("Opcion 1"));
		subOpciones.add(new JMenuItem("Opcion 2"));
		
		
		archivo.add(new JMenuItem("Guardar"));
		archivo.add(new JMenuItem("Guardar Como"));
		archivo.addSeparator();
		archivo.add(subOpciones);
		edicion.add(new JMenuItem("Cortar"));
		edicion.add(new JMenuItem("Copiar"));
		edicion.add(new JMenuItem("Pegar"));
		herramientas.add(new JMenuItem("Generales"));
				
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		add(mibarra);
		
	}
}
