package codigoDuplicado;

public class Motocicleta implements Vehiculo{

	private String matricula;
	private double potencia;
	private int plazas;
	private int pesoKg;
	
	public Motocicleta (String matricula, double potencia, int plazas, int peso) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.plazas = plazas;
		this.pesoKg = peso;
	}
	
	/**
	 * 
	 * @param potencia
	 * @param peso
	 * @return la velocidad maxima permitida en autovia para dicho Vehiculo
	 */
	public double calculaVelocidadMaximaAutovia (double potencia, int peso) {
		
		double max = 110;
		if (peso > 3500) {
			max = 90;
		} else if (peso > 2000) {
			max = 100;
		}
		
		if (potencia < 100) {
			max -= 10;
		} else if (potencia > 200) {
			max += 10;
		}
		return max;
	}
	
	/**
	 * 
	 * @param plazas
	 * @param litrosMaletero
	 * @param consumo
	 * @return false en caso contrario.
	 */
	public boolean recomendadoParaViajes () {
		if (potencia > 50) {
			return true;
		}
		return false;
	}
	
	
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	
}
