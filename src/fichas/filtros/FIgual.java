package fichas.filtros;
import fichas.personaje.FichasAbs;

public class FIgual extends Filtro{
	private String clave;
	private Float valor;
	
	public FIgual(String clave, Float valor){
		this.clave = clave;
		this.valor = valor;
	}

	@Override
	public boolean cumple(FichasAbs ficha) {
		// TODO Auto-generated method stub
		return ficha.getAt(clave).compareTo(valor) == 0;
	}

}
