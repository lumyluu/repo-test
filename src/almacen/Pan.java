package almacen;

public class Pan extends Producto {
	private double kilo;

	public Pan(double kilo) {
		this.kilo = kilo;

	}

	public void vender() {
		System.out.println("producto vendido");
		kilo--;
		reponer();

	}

	public void reponer() {
		System.out.println("Kilos diponibles de pan " + getNombre() + " es: " + kilo);
		if (kilo < STOCK_MINIMO) {
			kilo += 5;
		}
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

}
