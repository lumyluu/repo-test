package trabajoEnClase;

public class Producto {
	private String articulo;
	private int precio;
	private int stock;
	public static int STOCK_MINIMO = 5;

	public boolean reponerStock() {

		return STOCK_MINIMO > stock;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;

	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
