package Layouts;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout marco = new Marco_Layout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}


class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		Panel_Layout lamina = new Panel_Layout();
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		add(lamina,BorderLayout.NORTH);
		add(lamina2,BorderLayout.SOUTH);
	}
}

class Panel_Layout extends JPanel{
	
	
	//La posicion de los botones en la lamina se debe a que por defecto se tiene un FlowLayout Center
	public Panel_Layout(){
		
		//Aqui cambiamos la ubicacion de los botones
		FlowLayout disposicionFL = new FlowLayout(FlowLayout.LEFT,75,100); //El segundo argumento da la separacion horizontl y el tercer parametro la vertical
		
		BorderLayout disposicionBL = new BorderLayout(10,10); //Los parametros dan la separacion horizontal y vertical entre los componentes
		
		setLayout(disposicionFL);
		
		/*
		//Este codigo solo funciona con la disposicion BorderLayout
		add(new JButton("Amarillo"),BorderLayout.NORTH);
		add(new JButton("Rojo"),BorderLayout.SOUTH);
		*/
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));

		
	}
}

class Panel_Layout2 extends JPanel{
	
	public Panel_Layout2(){
		
		//Aqui cambiamos la ubicacion de los botones
		FlowLayout disposicionFL = new FlowLayout(FlowLayout.CENTER,75,100); //El segundo argumento da la separacion horizontl y el tercer parametro la vertical
		
		BorderLayout disposicionBL = new BorderLayout(10,10); //Los parametros dan la separacion horizontal y vertical entre los componentes
		
		setLayout(disposicionBL);
		

		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
		
	}
}