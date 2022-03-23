/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

/**
 * The HelloWorldApp class implements an application that simply prints "Hello
 * World!" to standard output.
 */

public class HelloWorld {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!"); // Display the string.
		System.out.println("Hello World!2");
		System.err.println("Error");
		System.out.println("Resultado" + args);
		String anio = args[0];
		String mes = args[1];
		System.out.println("A�o: " + anio + "Mes: " + mes);
		long time = System.currentTimeMillis();
		System.out.println("Time:" + time);

		int maximo = 10;
		float precio;
		double sueldo;
		boolean estaAbierto = maximo < 9; // true
		int dias = 5;
		boolean segundaCondicion = (dias < 7 || dias == 0); // || es "or"
		if (estaAbierto && segundaCondicion) { // && es y (coloquial)
			System.out.println("est� abierto");
		}
		// fin del if

		int i = 0;
		int j = 0;
		while (i < maximo) {
			System.out.println(i);
			while (j < 10) {
				System.out.println(j + " ");
				j++;
			}
			i++;
		}
		System.out.println("fin i");
	}
/*
	int i =0;while(i<maximo)
	{
		System.out.println(i);
		i++;
	}

	Bicicleta bici1 = new Bicicleta();
	Bicicleta bici2 = new Bicicleta();bici1.ponerColor("blanco");
	String colorBici1 = bici1
			.dameColor();bici2.ponerColor(colorBici1);System.out.println("color bici 1: "+bici1.dameColor());System.out.println("color bici 2: "+bici1.dameColor());

}
*/
}
