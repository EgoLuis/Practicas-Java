package arraylist;
import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList2 archivos = new ArrayList2(5);
		
		archivos.add("Juan");
		archivos.add("Mar�a");
		archivos.add("Ana");
		archivos.add("Sandra");
		archivos.add(new File("gesion_Pedidos.accdb"));
		String nombrePersona = (String)archivos.get(4);
		
		System.out.println(nombrePersona);

	}

}
