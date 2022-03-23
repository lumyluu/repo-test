package trabajopractico3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int tamaño;
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántos elementos tiene tu vector?");
		tamaño = scanner.nextInt();

		int vectorA[] = new int[tamaño];
		int vectorB[] = new int[tamaño];
		int vectorC[] = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			System.out.println("Ingrese los elementos vector A ");
			vectorA[i] = scanner.nextInt();
			System.out.println("Ingrese los elementos vector B ");
			vectorB[i] = scanner.nextInt();

			vectorC[i] = vectorA[i] + vectorB[i];

		}

		System.out.println("La suma es: " + vectorC);
	}
}
