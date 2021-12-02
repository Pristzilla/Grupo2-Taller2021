package codigoDuplicado;

public class Coche implements Vehiculo{

	private String matricula;
	private double potencia;
	private int plazas;
	private int pesoKg;
	private int litrosMaletero;
	private double consumoALos100;
	
	public Coche (String matricula, double potencia, int plazas, int peso, int litros, double consumo) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.plazas = plazas;
		this.pesoKg = peso;
		litrosMaletero = litros;
		consumoALos100 = consumo;
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
	
	public boolean recomendadoParaViajes (int plazas, int litrosMaletero, double consumo) {
		boolean recomendado = true;
		
		if (litrosMaletero < 500 || litrosMaletero > 2000 || plazas < 4) {
			recomendado = false;
		} 
		
		if (consumo < 5 && litrosMaletero > 500) {
			recomendado = true;
		}
		
		return recomendado;
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
