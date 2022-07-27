package LuisSockets;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

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
			ServerSocket servidor = new ServerSocket(5000);
			String nick, ip, mensaje;
			PaqueteEnvio paquete_recibido;
			ArrayList<String> listaIp = new ArrayList<String>();
			
			while(true) {
				Socket misocket = servidor.accept();

				ObjectInputStream paquete_datos = new ObjectInputStream(misocket.getInputStream());
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();		
				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje = paquete_recibido.getMensaje();
				
				if(!mensaje.equals(" online")) {
					areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
					
					Socket enviaDestinatario = new Socket(ip,9090);
					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
					paqueteReenvio.writeObject(paquete_recibido);
					paqueteReenvio.close();
					enviaDestinatario.close();
					misocket.close();
				} else {
					InetAddress localizacion = misocket.getInetAddress();
					String IpRemota = localizacion.getHostAddress();
					listaIp.add(IpRemota);
					paquete_recibido.setIps(listaIp);
					
					for(String z:listaIp) {
						Socket enviaDestinatario = new Socket(z,9090);
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
						paqueteReenvio.writeObject(paquete_recibido);
						paqueteReenvio.close();
						enviaDestinatario.close();
						misocket.close();
					}
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	
	
	
}


