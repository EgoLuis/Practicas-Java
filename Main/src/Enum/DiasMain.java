package Enum;

public class DiasMain {
	
	public enum dias{
		LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
		String clima, climap;
		
		private dias() {
			this.clima = "soleado";
		}
		
		private void pronostico(String clima) {
			this.clima = clima;
		}
		
		public String getClima() {
			return clima;
		}
		
		public void setClima(String clima) {
			this.clima = clima;
		}
		
	}
	
	public static void main(String[] args) {
		
		dias dia = dias.LUNES;
		dias dia2 = dia.MARTES;
		
		System.out.println(dia.name());
		System.out.println(dia.toString());
		System.out.println(dia.ordinal());
		System.out.println(dia.compareTo(dia2));
		System.out.println(dias.values());
		
	}

}
