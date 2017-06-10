package fichas.personaje;
import fichas.filtros.*;
import java.util.HashMap;
import java.util.List;

public abstract class FichasAbs {
	
	String nombre;
	public FichasAbs(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public String toString(){
    	return getNombre()+" ";
    }
	
	public abstract List<Ficha> listar(Filtro f);
	
	public abstract Float getAt(String s);

}
