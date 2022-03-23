package trabajoEnClase;

public class Persona {
	private String nombre;
	private int altura;
	private int dni;

	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, int altura) {
		this.nombre = nombre;
		this.altura = altura;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre, int altura) {
		this.nombre = nombre;
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;

	}

	public static Persona crearObjeto() {

		return new Persona();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
}
