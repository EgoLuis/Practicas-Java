package ClasesObjetosYMetodos;

import java.security.cert.CertificateNotYetValidException;

public class Inferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var numero = 3.3;
		var palabra = "casa";
		
		System.out.println("LA variable palabra es de tipo " + palabra.getClass().getSimpleName());

		var certificateNotYetValidException = new CertificateNotYetValidException();
		
		String property = System.getProperty("os.name");
		
	}

}
