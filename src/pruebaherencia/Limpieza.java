package pruebaherencia;

public class Limpieza extends Persona {
	private int horasSemanales;

	public Limpieza(String nombre, int dni, int horasSemanales) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.horasSemanales = horasSemanales;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
}
