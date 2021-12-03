package codigoDuplicado;

public abstract class Vehiculo {

	/**
	 * 
	 * @param consumo
	 * @param potencia
	 * @param plazas
	 * @return un precio aproximado del vehiculo con esas caracteristicas
	 */
	public double calcularPrecioAproximado (double consumo, int potencia, int plazas) {
		double precio = 0;
		precio = potencia * 100 + plazas * 1000 + (5000 / consumo);
		return precio;
	}
	
	
	
}
