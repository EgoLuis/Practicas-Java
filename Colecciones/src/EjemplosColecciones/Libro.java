package EjemplosColecciones;

import java.util.Objects;

public class Libro {
	
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	public String getDatos() {
		return "El titulo es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
	}
	
	/*Este m�todo lo sobreescribimos manualmente pero Eclipse puede hacerlo automaticamente
	 * 
	//para que el m�todo equals (ya exisente) funcione con las clases que nosotros creamos es necesario sobreescribirlo
	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otro = (Libro)obj;
			if(this.ISBN==otro.ISBN) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}*/
	
	//siempre que se sobreescriba el m�todo equal tambi�n se debe sobreescribir el m�todo hashcode
	
	//Los siguientes m�todos los sobreescribe eclipse
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}

	private String titulo;
	private String autor;
	private int ISBN;

}
