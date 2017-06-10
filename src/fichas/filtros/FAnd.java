package fichas.filtros;

import fichas.personaje.FichasAbs;

public class FAnd extends Filtro{
	Filtro f1;
	Filtro f2;
	
	public FAnd(Filtro f1, Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(FichasAbs ficha) {
		// TODO Auto-generated method stub
		return (f1.cumple(ficha) && f2.cumple(ficha));
	}

}
