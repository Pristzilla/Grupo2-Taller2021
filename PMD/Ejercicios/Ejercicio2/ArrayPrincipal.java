import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrincipal {

	public static void main(String[] args) {
		OpsArray o;
		o = null;
		o = new OpsArray();
		int[] arrayint = new int[] {1, 2, 3, 4};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1); l.add(2); l.add(3); l.add(4);
		
		int resultado = o.sumaArray(arrayint);
		try {
			resultado = o.restaArray(resultado*2, arrayint);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		int resultadoL = o.sumaList(l);
		try {
			resultadoL = o.restaList(resultado*2, l);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		if(resultado > resultadoL) {
			System.out.println("Array mayor");
		}
		else if (!(resultado > resultadoL)){
			System.out.println("Array no es mayor");
			if(resultadoL > resultado) {
				System.out.println("List es mayor");
			}
		}

	}

}
