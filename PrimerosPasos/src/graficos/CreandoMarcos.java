package graficos;
import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true); //hace el marco visible
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hace que cuando cerremos la ventana el programa termine
		
	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		//setSize(500,300); //da el tama�o inicial de la ventana, medidas en pixeles
		//setLocation(500,300); //establece la localizaci�n de apertura del frame seg�n ejes coordenados x,y
		setBounds(500,300,550,250); //Reemplaza a setSize y setLocation, los primeros dos par�metros son la ubicaci�n y los siguientes el tama�o
		//setResizable(false); //Reedimensionamiento de ventana, true para permitir y false para restringir
		//setExtendedState(JFrame.MAXIMIZED_BOTH); //hace que la ventana tome el tama�o de la pantalla
		setTitle("Mi ventana"); //da un titulo a la ventana
		
	}
	
	
}