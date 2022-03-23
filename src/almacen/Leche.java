package almacen;

public class Leche extends Producto {
	private int litros;

	public Leche(int litros) {
		this.litros = litros;
	}

	public void vender() {
		System.out.println("producto vendido");
		litros--;
		reponer();
	}

	public void reponer() {
		System.out.println("Litros diponibles de leche " + getNombre() + " es: " + litros);
		if (litros < STOCK_MINIMO) {
			litros += 5;
		}
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}
}
