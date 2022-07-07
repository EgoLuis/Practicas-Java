package iEvolve;

import java.util.*;

public class PackagesNumberFinder {
	
	public String digitFinder(String text) {
		
		char[] caracteres = text.toCharArray();
		List<Character> digitos = new ArrayList<Character>();
		
		for(int i = 0; i < caracteres.length; i++) {
			
			if(Character.isDigit(caracteres[i])) {
				digitos.add(caracteres[i]);
			}
			if(Character.isDigit(caracteres[i]) && !Character.isDigit(caracteres[i+1])) {
				digitos.add(' ');
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Character e : digitos) {
			sb.append(e);
		}
		String cadenaDigitos = sb.toString().trim();
		String[] temp = cadenaDigitos.split(" ");
		String passwordOne = KeithCompositeNumber(temp);
		return passwordOne;
		
	}
	
	private String KeithCompositeNumber(String[] digitos) {
		int numero;
		List<Integer> correctos = new ArrayList<Integer>();
		for(String e : digitos) {
			numero = Integer.parseInt(e);
			if(IsKeithNumber(numero) && IsCompositeNumber(numero)) {
				correctos.add(numero);
			}
		}
		String respuesta = "";
		for(int e : correctos) {
			respuesta = respuesta + String.valueOf(e);
		}
		return respuesta;
	}
	
	private boolean IsKeithNumber(int n) {
		
		List<Integer> fibonacci = new ArrayList<Integer>();
		int prov = n;
		
		if(n < 10) return false;
		else {
			prov = volteaNumero(prov);
			while(prov != 0) {
				fibonacci.add(prov % 10);
				prov = prov / 10;
			}
			int terminos = fibonacci.size();
			int nuevo = 0;
			for(int e : fibonacci) {
				nuevo += e;
			}
			if(nuevo == n) return true;
			else if(nuevo > n) return false;
			else {
				while (nuevo <= n) {
					fibonacci.add(nuevo);
					nuevo = 0;
					for(int i = 0; i < terminos; i++) {
						nuevo = nuevo + fibonacci.get(fibonacci.size() - i - 1);
					}
					if(nuevo == n) return true;
				}
			}
		}
		
		return false;
	}
	
	private boolean IsCompositeNumber(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
	private int volteaNumero(int n2) {
		String cambio = String.valueOf(n2);
		String reverse = "";
		for(int i = cambio.length() - 1; i >=0; i--) {
			reverse = reverse + cambio.charAt(i);
		}
		int n3 = Integer.parseInt(reverse);
		return n3;
	}

}
