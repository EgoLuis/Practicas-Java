package ProgramacionFuncional;

public class Square {
	
	int sideLength;
	
	public Square(int sideLength) {
		this.sideLength = sideLength;
	}
	
	public int calcularArea() {
		return sideLength * sideLength;
	}

}
