package trabajoEnClase;

public class Casa {
	private String calle;
	private int altura;
	private int m2Cubiertos;
	private int ambientes;

	public Casa() {

	}

	public Casa(String calle) {
		this.calle = calle;

	}

	public Casa(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
	}

	public Casa(String calle, int altura, int m2Cubiertos) {
		this.calle = calle;
		this.altura = altura;
		this.m2Cubiertos = m2Cubiertos;
	}

	public String getCalle() {
		return calle;

	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getM2Cubiertos() {
		return m2Cubiertos;
	}

	public void setM2Cubiertos(int m2Cubiertos) {
		this.m2Cubiertos = m2Cubiertos;
	}

	public int getAmbientes() {
		return ambientes;
	}

	public void setAmbientes(int ambientes) {
		this.ambientes = ambientes;
	}
}
