package pruebaherencia;

public class Vendedor extends Persona {
	private double comision;

	public Vendedor(String nombre, int dni, int comision) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}
