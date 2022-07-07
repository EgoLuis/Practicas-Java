package iEvolve;

import java.util.*;

public class GenericStudentList<T>{
	
	private ArrayList<T> list = new ArrayList<T>();
	private String resultado;
	int contador;
	
	public void addElement(T Type) {	
		list.add(Type);
	}
	 
	public void removeElement(T Type) {
		list.remove(Type);
	}
	
	public T getElement(int n) {
		return list.get(n);
	}
	
	
	public String beginsWith(String letra) {
		resultado = "";
		for(T e : list) {
			if(((String)e).startsWith(letra.toUpperCase()) || ((String)e).startsWith(letra.toLowerCase())) {
				resultado = resultado + e + "\n";
			}
		}
		return resultado;
	}
	
	
	public String bloodGroupOf(String[] sangreEst, String tipo) {	
		resultado = "";
		for(int i = 0; i < sangreEst.length; i++) {
			if(sangreEst[i].equals(tipo)) {
				resultado = resultado + list.get(i) + "\n";
			}
		}
		return resultado;
	}
	
	
	public int thresholdScore(int n) {
		contador = 0;
		for(T e : list) {
			if ((Integer)e >= n) contador++;
		}
		return contador;
	}
	
	


}
