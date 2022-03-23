package pruebaherencia;

public class Administrativo extends Persona {
	private int antiguedad;

	public Administrativo(String nombre, int dni, int antiguedad) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
