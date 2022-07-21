package LuisSockets;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Cliente {
	

	
	public static void main(String[] args) {
		
		MarcoCliente mimarco = new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
	class MarcoCliente extends JFrame {
		
		public MarcoCliente() {
			setBounds(600,300,280,350);
			LaminaMarcoCliente milamina = new LaminaMarcoCliente();
			add(milamina);
			setVisible(true);
		}	
	}
	
	
	class LaminaMarcoCliente extends JPanel{
		
		private JTextField campo1;
		private JButton miboton;
		
		public LaminaMarcoCliente() {
			JLabel texto = new JLabel("CLIENTE");
			add(texto);
			campo1 = new JTextField(20);
			add(campo1);
			miboton = new JButton("Enviar");
			EnviaTexto mievento = new EnviaTexto();
			miboton.addActionListener(mievento);
			add(miboton);
		}
		
		
		private class EnviaTexto implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("antes del socket");
					//"177.249.171.139"
					Socket misocket = new Socket("177.249.171.139", 5000);
					System.out.println("antes del flujo");
					DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
					System.out.println("antes de escribir");
					flujo_salida.writeUTF(campo1.getText());
					System.out.println("antes de cerrar");
					flujo_salida.close();
					misocket.close();
					System.out.println("Despues de cerrar");
				} catch (UnknownHostException e2) {
					e2.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	


