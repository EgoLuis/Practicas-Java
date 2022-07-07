package iEvolve;

import java.util.*;

public class GenericScoreList<T>{
	
	private ArrayList<T> list = new ArrayList<T>();
	double contador;
	double promedio;
	double calificaciones;
	
	
	public void addElement(T Type) {	
		list.add(Type);
	}
	 
	public void removeElement(T Type) {
		list.remove(Type);
	}
	
	public T getElement(int n) {
		return list.get(n);
	}
	
	
	public double averageValues() {
		contador = 0;
		calificaciones = 0;
		for(T e : list) {
			contador++;
			calificaciones += (Double)e;
		}
		promedio = calificaciones / contador;
		return promedio;
		
	}
	
	


}
