package iEvolve;

public class PackagesExtractString {
	
	public String addDigits(String text) {
		
		char[] caracteres = text.toCharArray();
		int adicion = 0;
		
		for(int i = 0; i < caracteres.length - 5; i++) {
			
			if((caracteres[i] == 'o' || caracteres[i] == 'O') && caracteres[i+1] == 'n' && caracteres[i+2] == 'e' && caracteres[i+3] == ' ') {
				adicion +=1;
			} else if ((caracteres[i] == 't' || caracteres[i] == 'T') && caracteres[i+1] == 'w' && caracteres[i+2] == 'o') {
				adicion +=2;
			} else if ((caracteres[i] == 't' || caracteres[i] == 'T') && caracteres[i+1] == 'h' && caracteres[i+2] == 'r' && caracteres[i+3] == 'e' && caracteres[i+4] == 'e') {
				adicion +=3;
			} else if ((caracteres[i] == 'f' || caracteres[i] == 'F') && caracteres[i+1] == 'o' && caracteres[i+2] == 'u' && caracteres[i+3] == 'r') {
				adicion +=4;
			} else if ((caracteres[i] == 'f' || caracteres[i] == 'F') && caracteres[i+1] == 'i' && caracteres[i+2] == 'v' && caracteres[i+3] == 'e') {
				adicion +=5;
			} else if ((caracteres[i] == 's' || caracteres[i] == 'S') && caracteres[i+1] == 'i' && caracteres[i+2] == 'x') {
				adicion +=6;
			} else if ((caracteres[i] == 's' || caracteres[i] == 'S') && caracteres[i+1] == 'e' && caracteres[i+2] == 'v' && caracteres[i+3] == 'e' && caracteres[i+4] == 'n') {
				adicion +=7;
			} else if ((caracteres[i] == 'e' || caracteres[i] == 'E') && caracteres[i+1] == 'i' && caracteres[i+2] == 'g' && caracteres[i+3] == 'h' && caracteres[i+4] == 't') {
				adicion +=8;
			} else if ((caracteres[i] == 'n' || caracteres[i] == 'N') && caracteres[i+1] == 'i' && caracteres[i+2] == 'n' && caracteres[i+3] == 'e') {
				adicion +=9;
			}
		}
		
		String password2 = String.valueOf(adicion);
		return password2;
	}


}
