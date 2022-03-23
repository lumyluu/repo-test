package trabajopractico1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		double sueldoSemanal, ahorroSemanal, ahorroAnual;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese sueldo semanal: ");

		sueldoSemanal = scanner.nextDouble();

		ahorroSemanal = sueldoSemanal * 0.15;
		ahorroAnual = (ahorroSemanal * 4) * 12;

		System.out.println("Ahorro anual $" + ahorroAnual);

	}
}
