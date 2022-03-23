package trabajoEnClase;

//*Ejercicio 1:
//Generar la clase Producto (de supermercado). Identificar algunos atributos,
//implementar getters/setters
//Generar objetos Producto desde una clase AppProducto y darle valores a los
//atributos de cada objeto 
public class SupermercadoApp {
	public static void main(String[] args) {
		Producto productos[] = new Producto[4];

		Producto producto1 = new Producto();
		producto1.setArticulo("Mayonesa Menoyo");
		producto1.setPrecio(80);
		producto1.setStock(6);

		Producto producto2 = new Producto();
		producto2.setArticulo("Pan Bimbo");
		producto2.setPrecio(150);
		producto2.setStock(3);

		Producto producto3 = new Producto();
		producto3.setArticulo("Puré de tomate Molto");
		producto3.setPrecio(45);
		producto3.setStock(7);

		Producto producto4 = new Producto();
		producto4.setArticulo("Sal 2 anclas");
		producto4.setPrecio(75);
		producto4.setStock(2);

		productos[0] = producto1;
		productos[1] = producto2;
		productos[2] = producto3;
		productos[3] = producto4;

		System.out.println(" ARTÍCULOS");
		System.out.println();

		for (int i = 0; i < 4; i++) {

			System.out.println("ARTICULO: " + productos[i].getArticulo() + " reponer: " + productos[i].reponerStock());
		}

	}

}
