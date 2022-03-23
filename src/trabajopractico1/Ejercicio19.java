package trabajopractico1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		int dias = 0;
		double costoHabitacion = 0, total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese dias: ");

		dias = scanner.nextInt();

		System.out.println("Ingrese precio de habitación: ");

		costoHabitacion = scanner.nextDouble();

		total = costoHabitacion * dias;

		System.out.println("Total $" + total);

	}
}
