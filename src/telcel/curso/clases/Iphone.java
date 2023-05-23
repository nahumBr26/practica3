package telcel.curso.clases;

import telcel.curso.abstractas.Electronico;
import telcel.curso.interfaces.IProducto;

public class Iphone extends Electronico implements IProducto {

	private String color;
	private String modelo; 
	
	

	
	public Iphone(String fabricante, String color, String modelo) {
		super(fabricante);
		this.color = color;
		this.modelo = modelo;
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

	public String getColor() {
		return color;
	}

	public String getModelo() {
		return modelo;
	}	
	
	
	
}
