package iEvolve;
import java.util.ArrayList;
import java.util.regex.*;


public class RegexExercise {
	 
	public String findCardTypeNumbers(String conversation, String cardType){
		
		String respuesta = "";
		String regex;
		Pattern p;
		Matcher m;
		
		switch(cardType) {
		case "Visa":
			regex = "[^0-9]4[0-9]{15}[^0-9]|[^0-9]4[0-9]{12}[^0-9]";
			p = Pattern.compile(regex);
			m = p.matcher(conversation); 
			while(m.find()) {
				String valor = m.group();
				int finalInd = valor.length()-1;
				String v = valor.substring(1,finalInd);	
				respuesta = respuesta + v + " ";
			}
			respuesta = respuesta.trim();
			return respuesta;
		
		case "American Express":
			regex = "[^0-9]34[0-9]{13}[^0-9]|[^0-9]35[0-9]{13}[^0-9]";
			p = Pattern.compile(regex);
			m = p.matcher(conversation); 
			while(m.find()) {
				String valor = m.group();
				int finalInd = valor.length()-1;
				String v = valor.substring(1,finalInd);	
				respuesta = respuesta + v + " ";
			}
			respuesta = respuesta.trim();
			return respuesta;

		case "Discover":
			regex = "[^0-9]6011[0-9]{12}[^0-9]|[^0-9]65[0-9]{14}[^0-9]";
			p = Pattern.compile(regex);
			m = p.matcher(conversation); 
			while(m.find()) {
				String valor = m.group();
				int finalInd = valor.length()-1;
				String v = valor.substring(1,finalInd);	
				respuesta = respuesta + v + " ";
			}
			respuesta = respuesta.trim();
			return respuesta;
		
		case "JCB":
			regex = "[^0-9]2131[0-9]{11}[^0-9]|[^0-9]1800[0-9]{11}[^0-9]|[^0-9]35[0-9]{14}[^0-9]";
			p = Pattern.compile(regex);
			m = p.matcher(conversation); 
			while(m.find()) {
				String valor = m.group();
				int finalInd = valor.length()-1;
				String v = valor.substring(1,finalInd);	
				respuesta = respuesta + v + " ";
			}
			respuesta = respuesta.trim();
			return respuesta;
		
			default:
				return "Not a valid card type";
		
		}   
	}
}
