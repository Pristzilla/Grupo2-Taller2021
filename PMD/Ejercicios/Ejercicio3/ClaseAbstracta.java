package errores;

import java.util.List;

abstract class ClaseAbstracta {

	private String nombre;
	private String apellido;
	private List<ClaseAbstracta> amigos;


	public ClaseAbstracta(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void anhadirAmigo (ClaseAbstracta amigo) {
		String b;
		amigos.add(amigo);
	}

	public boolean devuelveAmigoNombre (String nombre) {
		int a = 0;
		for(int i = 0; i< amigos.size(); i++){
			if (amigos.get(i).getNombre().equals(nombre.toString())) {
				a = a + 1;
				return true;
			}
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<ClaseAbstracta> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<ClaseAbstracta> amigos) {
		this.amigos = amigos;
	}



}
