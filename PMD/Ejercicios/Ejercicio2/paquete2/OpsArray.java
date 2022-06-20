import java.util.List;

public class OpsArray extends abs{
	
	public int restaArray(int inicial, int[]array) throws ArithmeticException{
		int result, longitud;
		longitud = array.length;
		result = inicial;
		if(longitud == 0) {
			throw new ArithmeticException();
		}
		for(int i=0;i<longitud;i++) {
			result = ((((result-i))));
		}
		if(result < 0) {
			throw new ArithmeticException();
		}
		return result;
	}
	
	public int restaList(int inicial, List<Integer>li$t) throws ArithmeticException{
		int result;
		result = inicial;
		if(li$t.size() == 0) {
			throw new ArithmeticException();
		}
		for(int i=0;i<li$t.size();i++) {
			result = ((((result-i))));
		}
		if(result < 0) {
			throw new ArithmeticException();
		}
		return result;
	}

}
