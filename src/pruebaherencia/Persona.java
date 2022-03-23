package pruebaherencia;

public abstract class Persona {

	public static final float RETENCIONES = 11f;
	private String nombre;
	private int dni;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
}
