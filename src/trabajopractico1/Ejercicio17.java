package trabajopractico1;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {

		double nota1, nota2, nota3, promedio, promedioTotal;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese nota 1: ");

		nota1 = scanner.nextDouble();

		System.out.println("Ingrese nota 2: ");

		nota2 = scanner.nextDouble();

		System.out.println("Ingrese nota3 ");

		nota3 = scanner.nextDouble();

		promedio = nota1 * 0.25;
		promedio = (nota2 * 0.25) + promedio;
		promedio = (nota3 * 0.50) + promedio;

		System.out.println("Su promedio es: " + promedio);

	}
}
