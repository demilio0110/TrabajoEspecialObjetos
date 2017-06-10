package fichas.personaje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fichas.comparadores.comparador;
import fichas.filtros.Filtro;

public class Grupo extends FichasAbs{
	
	private List<FichasAbs> elem;
	
	public Grupo(String nombre){
		super(nombre);
		elem = new ArrayList<>();
	}
		
	public void addFicha(FichasAbs ficha){
		elem.add(ficha);
	}
	
	public Float getAt(String s){
		int y = 0;
		float x = 0;
		for (FichasAbs l : elem){
			x += l.getAt(s);
		}
		y = elem.size();
		return (float)x/y;
	}
		
	public List<Ficha> listar(Filtro f) {
		List<Ficha> aux = new ArrayList<>();
		for (FichasAbs e: elem){
			if(!aux.contains(this))
				aux.addAll(e.listar(f));
		}
		return sinrepetidos(aux);
	}
	
	public List<Ficha> listar(Filtro f, Comparator<Ficha> c1) {
		List<Ficha> aux = new ArrayList<>();
		for (FichasAbs e: elem){
			if(!aux.contains(this))
				aux.addAll(e.listar(f));
		}
		List<Ficha> n = new ArrayList<>();
		n = sinrepetidos(aux);
		Collections.sort(n, c1);
		return n;
	}

	public String getInfoGrupo(List<String> l) {
		String info="";
			for (String i : l){
				info += "-> "+i+" "+this.getAt(i)+"\n";
			}
		return info;
	}
	
	private List<Ficha> sinrepetidos(List<Ficha> l){
		List<Ficha> nueva = new ArrayList<>();	 
		for(Ficha s: l){
			if (!nueva.contains(s))
				nueva.add(s);
		}
		return nueva;
	}
}	
