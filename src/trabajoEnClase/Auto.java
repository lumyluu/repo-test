package trabajoEnClase;

public class Auto {
	private String marca;
	private int velocidad;
	private int ruedas;

	public static int VELOCIDAD_MAX = 120;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void acelerar(int aceleracion) {
		if ((velocidad + aceleracion) > VELOCIDAD_MAX) {
			System.out.println(marca + " Superaste la velocidad máxima ");
		} else {
			velocidad += aceleracion;
			System.out.println(marca + " Tu aceleración actual es: " + velocidad);
		}

	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

}
