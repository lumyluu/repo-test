package trabajopractico2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		double articulo, desc1, desc2, desc3, valorTotal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese valor de articulo");

		articulo = scanner.nextDouble();

		desc1 = 0.85;
		desc2 = 0.88;
		desc3 = 0.90;

		if (articulo >= 200) {
			valorTotal = articulo * desc1;
		} else if (articulo > 100 && articulo < 200) {

			valorTotal = articulo * desc2;
		} else if (articulo < 100) {
			valorTotal = articulo * desc3;

		}

		System.out.println("Total a pagar " + valorTotal);

	}
}
