package pruebaherencia;

public class Rectangulo extends FiguraGeometrica {
	int ladoA, ladoB, ladoC, ladoD;

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

	public int getLadoD() {
		return ladoD;
	}

	public void setLadoD(int ladoD) {
		this.ladoD = ladoD;
	}

	@Override
	public int calcularArea() {
		return (this.getBase() * this.getAltura());
	}
}
