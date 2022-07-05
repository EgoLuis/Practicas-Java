package iEvolve;

import java.util.*;

public class AbstractSelfFinance extends AbstractStudent {

	@Override
	public String result(String allMarks) {
		
		String[] SetList = allMarks.split("\\|");
		
		String[] subjectMarks = SetList[0].split(",");
		String[] sportsMarks = SetList[1].split(",");
		
		List<String> smSeparate = new ArrayList<String>();
		
		
		for(int i = 0; i < subjectMarks.length; i++) {		
			String[] prov = subjectMarks[i].split(" "); 		
			for (String e : prov) {
				smSeparate.add(e);
			}
		}
		
		double gradeXcredit = 0;
		double credit = 0;
		double firstM = 0;
		double secondM = 0;
		double thirdM = 0;
		
		for(int i = 0; i < smSeparate.size(); i += 2) {
			firstM = Double.parseDouble(smSeparate.get(i));
			secondM =  Double.parseDouble(smSeparate.get(i+1));
			firstM = changeGrade(firstM);
			gradeXcredit += firstM * secondM;
			credit += 5;
		}
				
		firstM = Double.parseDouble(sportsMarks[1]);
		secondM = Double.parseDouble(sportsMarks[2]);
		thirdM = Double.parseDouble(sportsMarks[0]);
		firstM = changeGrade(firstM);	
		gradeXcredit += firstM * secondM * thirdM;
		credit += 5 * thirdM;
		
		double CGPA = gradeXcredit / credit;
		
		String resultado = String.format("%.2f", CGPA);
		
		return resultado;
	}
	
	
	private double changeGrade(double mark) {
		if(mark < 40) { mark = 0; }
		else if (mark < 60) { mark = mark/10 + 2; }
		else if (mark < 75) { 
			int div = (int)((mark - 60) * 10 / 15);
			mark = 8.0 + div * 0.1; 
			}
		else { 
			int div = (int)((mark - 75) * 11 / 26);
			mark = 9.0 + div * 0.1;  
			}
		
		return mark;
		
	}

}
