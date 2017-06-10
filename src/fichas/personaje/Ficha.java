package fichas.personaje;
import fichas.filtros.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Ficha extends FichasAbs {
	
	private HashMap<String, Float> detalles;
	
	public Ficha(String nombre){
		super(nombre);
		detalles = new HashMap<>();
	}

	public void addAt(String s, Float i) {
		detalles.put(s, i);
	}

	public String contienekey(String s){
		if (detalles.containsKey(s))
			return s;
		return null;
	}
	
	public Float getAt(String s) {
		if (detalles.containsKey(s))
			return detalles.get(s);
		return (float)0;
	}

	public List<Ficha> listar(Filtro f) {
		List<Ficha> aux = new ArrayList<>();
		if (f.cumple(this))
			aux.add(this);
		return aux;
	}
	
	public String getInfo(){
		String info="";
		if (!detalles.isEmpty()){
			for(String s : detalles.keySet()){
				info += "-> "+s+" "+detalles.get(s)+"\n";
			}
		}
		return info;
	}
}