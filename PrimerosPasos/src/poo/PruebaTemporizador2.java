package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
	
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);
	}

}

class Reloj{
	

	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		//Una clase interna es una clase dentro de otra clase, mientras que una clase interna local es una clase dentro de un método
		
		 class DameLaHora2 implements ActionListener{ //las clases internas si pueden ser private, mientras que las internas locales no deben tener modificador de acceso
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("La hora cada 3 segundos es: " + ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		 
		 ActionListener oyente = new DameLaHora2();
	     Timer miTemporizador = new Timer(intervalo, oyente);
	     miTemporizador.start();
		
	}
	

}