package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders mimarco = new Frame_Sliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Frame_Sliders extends JFrame{
	
	public Frame_Sliders() {
		setBounds(550,400,550,350);
		Lamina_Sliders milamina = new Lamina_Sliders();
		add(milamina);
		setVisible(true);
	}
}

class Lamina_Sliders extends JPanel {
	
	private JLabel rotulo;
	private JSlider control;
	
	public Lamina_Sliders() {
		
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8,48,12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(4);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		control.setSnapToTicks(true);
		EventoSlider mievento = new EventoSlider();
		control.addChangeListener(mievento);
		
		JPanel laminaSlider = new JPanel();
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
		}
		
	}
}