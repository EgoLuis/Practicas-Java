package graficos;

import java.awt.*;

import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner mimarco = new FrameSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}


class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		setBounds(550,350,550,350);
		setVisible(true);
		add(new LaminaSpinner());
	}
	
}


class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control = new JSpinner(new SpinnerListModel(lista));
		
		JSpinner control2 = new JSpinner(new SpinnerNumberModel(10,0,100,5));
		
		//Uso de clase interna anónima
		JSpinner control3 = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			@Override
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			@Override
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		
		
		control.setPreferredSize(new Dimension(200,20));
		control2.setPreferredSize(new Dimension(100,20));
		control3.setPreferredSize(new Dimension(50,20));
		add(control);
		add(control2);
		add(control3);
	}
	
	/*
	private class MiModeloJSpinner extends SpinnerNumberModel{
		
		public MiModeloJSpinner() {
			super(5,0,10,1);
		}
		
		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
	*/
	
	
}
