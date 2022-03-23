package trabajopractico1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double m2, precioPorM2, total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese M2: ");

		m2 = scanner.nextDouble();

		System.out.println("Ingrese precio por M2: ");

		precioPorM2 = scanner.nextDouble();

		total = precioPorM2 * m2;

		System.out.println("Total a pagar $" + total);

	}
}
