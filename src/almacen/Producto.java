package almacen;

public class Producto {
	private String nombre;
	private double precio;
	private int stockDisponible;
	public static int STOCK_MINIMO = 5;

	// constructor que reciba el stock
	// metodo vender que va a mostrar en pantalla "vendi un producto" y va a reducir
	// el stock en 1
	// metodo reponer que va a revisar el stock, y si es menor al stock minimo vas a
	// sumar 10 al stock
	// public boolean reponerStock() {

	// return STOCK_MINIMO > stock;
	// }
	public Producto() {
	}

	public Producto(int stockDisponible) {
		this.stockDisponible = stockDisponible;
	}

	public void vender() {
		System.out.println("producto vendido");
		stockDisponible--;
		reponer();

	}

	public void reponer() {
		System.out.println("El stock diponible de " + nombre + " es: " + stockDisponible);
		if (stockDisponible < STOCK_MINIMO) {
			System.out.println("Faltante de stock");
			stockDisponible += 10;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stockDisponible;
	}

	public void setStock(int stock) {
		this.stockDisponible = stock;
	}

}
