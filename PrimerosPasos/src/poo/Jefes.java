package poo;

public interface Jefes extends Trabajadores { //es posible que una interfaz herede de otra
	
	String tomar_decisiones(String decision); //por defecto las interfaces son abstractas y públcas

}
