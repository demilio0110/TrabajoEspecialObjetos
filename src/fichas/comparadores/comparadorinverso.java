package fichas.comparadores;
import java.util.Comparator;

import fichas.personaje.Ficha;
import fichas.personaje.FichasAbs;

public class comparadorinverso implements Comparator<Ficha>{
		private comparador c;

		public comparadorinverso(){			
		}
		
		public void setComparador(comparador c)
		{
			this.c = c;
		}
		
		@Override
		public int compare(Ficha f1, Ficha f2) {
			return -1 * c.compare(f1, f2);
		}
}
