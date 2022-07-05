package iEvolve;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractSelfFinance stu1 = new AbstractSelfFinance();
		
		//String resultado = stu1.result("100 5,100 5,53 5,76 3|0,100,5|0,100,5");
		String resultado = stu1.result("100 5,100 5,53 5,76 3|0,100,5");
		
		System.out.println(resultado);
		
	}

}
