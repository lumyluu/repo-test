package pruebaherencia;

public class Triangulo extends FiguraGeometrica {
	private int ladoA;
	private int ladoB;
	private int ladoC;

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;

	}

	@Override
	public int calcularArea() {
		return (this.getBase() * this.getAltura()) / 2;
	}
}
