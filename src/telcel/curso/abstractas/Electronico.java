package telcel.curso.abstractas;

import telcel.curso.interfaces.IElectronico;

abstract public class Electronico implements IElectronico{

	protected String fabricante;
	
	
	
	public Electronico(String fabricante) {
		super();
		this.fabricante = fabricante;
	}



	@Override
	public String getFabricante() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	

}
