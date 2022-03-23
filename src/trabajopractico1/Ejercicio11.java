package trabajopractico1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		double kw, costoKW, total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese kw: ");

		kw = scanner.nextDouble();

		System.out.println("Ingrese costoKW: ");

		costoKW = scanner.nextDouble();

		total = kw * costoKW;

		System.out.println("Total a pagar $" + total);

	}
}
