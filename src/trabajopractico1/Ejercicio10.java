package trabajopractico1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		double M3Agua, costo, pago;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa M3 de agua: ");

		M3Agua = scanner.nextDouble();

		System.out.println("Ingrese costo: ");

		costo = scanner.nextDouble();

		pago = M3Agua * costo;

		System.out.println("Debe pagar $" + pago);

	}

}
