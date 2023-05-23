package telcel.curso.clases;

import java.util.Date;

import telcel.curso.abstractas.Producto;
import telcel.curso.interfaces.IProducto;

public class Libro extends Producto implements IProducto {

	private Date fechaPublicacion; 
	private String autor; 
	private String titulo; 
	private String editora; 
	
	
	
	public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editora) {
		super(precio);
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditora() {
		return editora;
	}
	
	
	

}
