package ConBre;

public class Ejemplo {
	
	public static void main(String[] args) {
		int[][] arrayInts = {
				{10,90,92,45},
				{77,20,9,12},
				{20,32,11,49}
		};
		
		int i,j=0;
		int buscando = 49;
		boolean encontrado = false;
		
		buscar:
			
			for(i=0; i < arrayInts[i].length; i++) {
				for(j=0; j < arrayInts[i].length; j++) {
					if(arrayInts[i][j] == buscando) {
						encontrado = true;
						break buscar;
					}
				}
			}
		
		if(encontrado) {
			System.out.println("Encontrando " + buscando + " en " + i + " , " + j);
		}else {
			System.out.println("No encontramos: " + buscando);
		}
 	}

}
