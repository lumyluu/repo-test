package trabajopractico1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {

		double hotel, comida, total, dineroDiario;
		int dias;

		Scanner scanner = new Scanner(System.in);

		dineroDiario = 100;

		System.out.println("Ingrese dias ");

		dias = scanner.nextInt();

		System.out.println("Ingrese gasto de hotel: ");

		hotel = scanner.nextDouble();

		System.out.println("Ingrese gasto comida: ");

		comida = scanner.nextDouble();

		hotel = hotel * dias;
		comida = comida * dias;
		dineroDiario = dineroDiario * dias;

		total = hotel + comida + dineroDiario;

		System.out.println("Hotel $" + hotel);
		System.out.println("Comida $" + comida);
		System.out.println("Total $" + total);
	}
}
