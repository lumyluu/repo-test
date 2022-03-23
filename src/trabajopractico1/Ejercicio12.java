package trabajopractico1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		double articulo, descuento, IVA, total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese artículo $");

		articulo = scanner.nextDouble();

		IVA = articulo * 0.15;

		total = IVA + articulo;

		descuento = total * 0.20;

		total = total - descuento;

		System.out.println("Precio con descuento $" + descuento);
		System.out.println("Precio final $" + total);

	}

}
