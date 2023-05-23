package telcel.curso.abstractas;

import telcel.curso.interfaces.IProducto;

abstract public class Producto implements IProducto{
	
	protected int precio;

	public Producto(int precio) {
		super();
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}		
	
	

}
