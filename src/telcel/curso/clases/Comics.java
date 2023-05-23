package telcel.curso.clases;

import java.util.Date;

import telcel.curso.interfaces.IProducto;

public class Comics extends Libro implements IProducto{
	private String personaje;

	public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editora, String personaje) {
		super(precio, fechaPublicacion, autor, titulo, editora);
		this.personaje = personaje;
	}
	
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPersonaje() {
		return personaje;
	}	
	
	
	

}
