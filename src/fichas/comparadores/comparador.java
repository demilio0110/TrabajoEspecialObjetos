package fichas.comparadores;

import java.util.Comparator;

import fichas.personaje.Ficha;
import fichas.personaje.FichasAbs;

public class comparador implements Comparator<Ficha>{

	private String clave;
	
	public comparador(String clave){
		this.clave = clave;
	}
	
	public void setClave(String clave){
		this.clave = clave;		
	}
	
	public int compare(Ficha f1, Ficha f2) {	
		if ( f1.getAt(clave) > f2.getAt(clave) )
			return 1;
		else if ( f1.getAt(clave) < f2.getAt(clave) )
			return -1;
		else 
			return 0;
	}
}
