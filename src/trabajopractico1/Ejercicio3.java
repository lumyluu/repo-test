package trabajopractico1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int edad, anioNacimiento, anioActual;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el año actual: ");
		anioActual = scanner.nextInt();
		System.out.println("Ingrese el año de nacimiento: ");
		anioNacimiento = scanner.nextInt();

		edad = anioActual - anioNacimiento;
		System.out.println("Su edad es: " + edad);

	}
}
