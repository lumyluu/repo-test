package almacen;

public class Galletitas extends Producto {
	private int paquete;

	public Galletitas(int paquete) {
		this.paquete = paquete;
	}

	public void vender() {
		System.out.println("producto vendido");
		paquete--;
		reponer();
	}

	public void reponer() {
		System.out.println("Paquetes diponibles de galletitas " + getNombre() + " es: " + paquete);
		if (paquete < STOCK_MINIMO) {
			paquete += 5;
		}
	}

	public int getPaquete() {
		return paquete;
	}

	public void setPaquete(int paquete) {
		this.paquete = paquete;
	}

}
