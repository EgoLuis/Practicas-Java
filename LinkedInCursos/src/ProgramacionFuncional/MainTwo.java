package ProgramacionFuncional;

public class MainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s = new Square (4);
		
		/*
		Shapes shapes = (Square square) -> {
			return square.calcularArea();
			};*/
			
		//Con la anotacion :: lo que hacemos es pasar un m�todo ya implementado a la interfez funcional
		Shapes shapes = Square::calcularArea;
		
	
		System.out.println("Area: " + shapes.getArea(s));

	}

}
