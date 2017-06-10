package fichas.filtros;

import fichas.personaje.FichasAbs;

public class FMenor extends Filtro{
	private String clave;
	private Float valor;
	
	public FMenor(String clave, Float valor){
		this.clave = clave;
		this.valor = valor;
	}
	@Override
	public boolean cumple(FichasAbs ficha) {
		// TODO Auto-generated method stub
		return ficha.getAt(clave).compareTo(valor)== -1;
	}
	
	
}
