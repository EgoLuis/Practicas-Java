package VectoresUso;

import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v1 = new Vector();
		Vector v2 = new Vector(10);
		Vector v3 = new Vector(v2);
		
		Vector<String> vector = new Vector<String>();
		
		vector.addElement("Cadena");
		
		
		vector.add("cadena2");
		
		vector.insertElementAt("AJ", 1);
		
		// ACCEDER
		System.out.println(vector.get(2));
		System.out.println(vector.size());
		System.out.println(vector.elementAt(2));
		
		//OPERACIONES
		System.out.println(vector.contains("AJ"));
		System.out.println(vector.indexOf("AJ"));
		
		//ELIMINAR
		vector.elementAt(0);
		vector.removeElement("AJ");
		vector.removeAll(vector);

	}

}
