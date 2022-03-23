package trabajoEnClase;

public class Limpieza extends Persona {
	private int horasSemanales;

	public Limpieza() {

	}

	public Limpieza(String nombre, int dni, int horasSemanales) {
		this.horasSemanales = horasSemanales;
		this.setNombre(nombre);
	}

	public int horasSemanales() {
		return horasSemanales;
	}

	public void horasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
}
