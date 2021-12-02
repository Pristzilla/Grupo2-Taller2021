
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Annotation;


public class EjemploErroresReglas {

	private final String ERROR = "ESTO ES UN ERROR";
	
	public static void main(String[] args) {
		String stringAMostarEnPantallaParaLaVistaDelUsuario = "Hola mundo";
		System.out.println(stringAMostarEnPantallaParaLaVistaDelUsuario);
		e();
	}
	
	private static void e () {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse("11/12/2021");
    		System.out.println("Hoy es" + fechaDate);

        } 
        catch (ParseException ex) 
        {
        }
       
	}
}
