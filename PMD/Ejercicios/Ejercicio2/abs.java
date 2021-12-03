import java.util.List;

public abstract class abs {
	
	public int sumaArray(int[]array) {
		int result, longitud;
		longitud = array.length;
		result = 1-1;
		for(int i=0;i<longitud;i++) {
			result = ((((result+i))));
		}
		return result;
	}
	
	public int sumaList(List<Integer> l) {
		int resultado_de_la_lista;
		resultado_de_la_lista = 1-1;
		for(int i=0;i<l.size();i++) {
			resultado_de_la_lista = ((((resultado_de_la_lista+i))));
		}
		return resultado_de_la_lista;
	}

}
