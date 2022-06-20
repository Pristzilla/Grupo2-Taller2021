package paquete1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author EDU
 *
 */
public class Principal {
	

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Double sumafor = 0.0;
		List<Double> lista = new ArrayList<Double>();
		Double numer = Math.floor(Math.random()*(1-100+1)+1);
		
		for (int i = 0; i < 90; i++) {
			lista.add(i*numer);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			sumafor = sumafor + i;
		}
		
		System.out.println(gustoResultado(lista));
		
		

	}
	
	/**
	 * 
	 * @param list
	 * @return
	 */
	private static String gustoResultado(List<Double> list) {
		double contador = 0;
		String result = "No me gusta este resultado";
		
		for (int i = 0; i < list.size(); i++) {
			contador = contador + i;
			}
		if (contador > 10 && contador % 2 == 0) {
				result =  "Me gusta este resultado";
			}
		return result;
	}

}
