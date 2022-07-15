package LuisSockets;

import java.awt.*;
import java.io.*;
import java.net.*;

import javax.swing.*;


public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco = new MarcoServidor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoServidor extends JFrame implements Runnable{
	
	private JTextArea areatexto;
	
	public MarcoServidor() {
		setBounds(1200,300,280,350);
		JPanel milamina = new JPanel();
		milamina.setLayout(new BorderLayout());
		areatexto = new JTextArea();
		milamina.add(areatexto,BorderLayout.CENTER);
		add(milamina);
		setVisible(true);
		Thread mihilo = new Thread(this);
		mihilo.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("antes del servidor");
			ServerSocket servidor = new ServerSocket(5000);
			System.out.println("antes de aceptar");
			Socket misocket = servidor.accept();
			System.out.println("antes de establecer stream");
			DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
			System.out.println("antes de leer");
			String mensaje_texto = flujo_entrada.readUTF();
			System.out.println("antes de escribir");
			areatexto.append("\n" + mensaje_texto);
			System.out.println("antes de cerrar");
			misocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	
}


