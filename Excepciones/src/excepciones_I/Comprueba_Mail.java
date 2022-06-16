package excepciones_I;
import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
	
		String mail = JOptionPane.showInputDialog("Introduce mail");
		try {
		examina_mail(mail);
		}catch(Longitud_mail_erronea e) {
			System.out.println("La dirección es muy corta");
			e.printStackTrace(); //imprime el mensaje de error de la excepcion
		}
	}
	
	static void examina_mail(String mail) throws Longitud_mail_erronea {
		int arroba = 0;
		boolean punto = false;
		
		if(mail.length()<=3) {
			throw new Longitud_mail_erronea("El mail es demasiado corto"); //con este comando lanzamos manualmente una excepcion al no cumplir un criterio que nosotros establezcamos, no confundir con throws que se usa al implementar métodos
		}else {
		
		for(int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i) == '@') {
				arroba++;
			}
			if(mail.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true) {
			System.out.println("Mail correcto");
		}
		else {
			System.out.println("Mail incorrecto");
		}
		}
	}

}

class Longitud_mail_erronea extends Exception{ //Cuando creamos una exception debe contar siempre con dos constructores: uno sin parametros y el otro con mensaje.
	public Longitud_mail_erronea() {}
	public Longitud_mail_erronea(String msj_error) {
		super(msj_error); //con esta instruccion estamos llamando al constructor de la clase Padre
	}
}
