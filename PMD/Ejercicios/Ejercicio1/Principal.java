import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
	
	private double privado;
	
	public static void main(String[] args) {
		Double sumafor = 0.0;
		List<Double> li$ta = new ArrayList<Double>();
		Double numero_random_para_el_for = Math.floor(Math.random()*(1-100+1)+1);
		
		for (int i = 0; i < 90; i++) {
			li$ta.add(i*numero_random_para_el_for);
		}
		
		for (int i = 0; i < li$ta.size(); i++) {
			sumafor = sumafor + i;
		}
		
		System.out.println(a(li$ta).toString());
		
		

	}
	
	private static String a(List<Double> list) {
		double c = 0;
		boolean total;
		
		for (int i = 0; i < list.size(); i++) {
			c = c + i;
			}
		if ((c > 10)) {
			if (((c % 2) == 0)) {
				return "Me gusta este resultado";
			}
			else {
				return "No me gusta este resultado";
			}
		}
		else {
			return "No me gusta este resultado";
		}
	}

}
