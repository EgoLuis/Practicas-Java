package iEvolve;

public class GenericStudentClass{
	
		public String getQuery(String studentData,String query){
        
		String[] queryList = query.split(",");
		String resultado = "";
		
		switch (queryList[0]) {
		
		case "1":
			String letra = queryList[1];
			String[] estudiantesOne = studentData.split(" ");
			for(String e : estudiantesOne) {
				if(e.startsWith(letra.toUpperCase()) || e.startsWith(letra.toLowerCase())) {
					resultado = resultado + e + "\n";
				}
			}
			break;
			
			
		case "2":
			String tipo = queryList[2];
			String[] estudiantesTwo = studentData.split(" ");
			String[] tipoEstudiantes = queryList[1].split(" ");
			for(int i = 0; i < tipoEstudiantes.length; i++) {
				if(tipoEstudiantes[i].equals(tipo)) {
					resultado = resultado + estudiantesTwo[i] + "\n";
				}
			}
			break;
			
			
		case "3":
			int calificacion = Integer.parseInt(queryList[1]);
			String[] calificacionEstudiantes = studentData.split(" ");
			int contador = 0;
			int elemento;
			for(String e : calificacionEstudiantes) {
				elemento = Integer.parseInt(e);
				if (elemento >= calificacion) contador++;
			}
			resultado = String.valueOf(contador) + " students scored " + queryList[1] + " above";
			break;
			
			
		case "4":
			String[] calificacionEstudiantesFour = studentData.split(" ");
			double suma = 0;
			double contadorFour = 0;
			double elementoFour;
			for(String e : calificacionEstudiantesFour) {
				contadorFour++;
				elementoFour = Double.parseDouble(e);
				suma += elementoFour;
			}
			double promedio = suma / contadorFour;
			resultado = String.format("%.2f", promedio);
			break;
			
		case "5":
			String[] calificacionEstudiantesFive = studentData.split(" ");
			double sumaFive = 0;
			double contadorFive = 0;
			double elementoFive;
			for(String e : calificacionEstudiantesFive) {
				contadorFive++;
				elementoFive = Double.parseDouble(e);
				sumaFive += elementoFive;
			}
			double promedioFive = sumaFive / contadorFive;
			resultado = String.format("%.2f", promedioFive);
			break;
			
		default:
		}
			
		return resultado;
		
    }

		
}
