package telcel.curso.clases;

import telcel.curso.abstractas.Electronico;
import telcel.curso.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto {

	private int pulgada; 
	
	
	
	public TvLcd(String fabricante, int pulgada) {
		super(fabricante);
		this.pulgada = pulgada;
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

	public int getPulgada() {
		return pulgada;
	}	
	

	
}
