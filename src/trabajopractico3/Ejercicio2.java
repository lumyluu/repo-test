package trabajopractico3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int tama�o;
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Cu�ntos elementos tiene tu vector?");
		tama�o = scanner.nextInt();

		int vectorA[] = new int[tama�o];
		int vectorB[] = new int[tama�o];
		int vectorC[] = new int[tama�o];

		for (int i = 0; i < tama�o; i++) {
			System.out.println("Ingrese los elementos vector A ");
			vectorA[i] = scanner.nextInt();
			System.out.println("Ingrese los elementos vector B ");
			vectorB[i] = scanner.nextInt();

			vectorC[i] = vectorA[i] + vectorB[i];

		}

		System.out.println("La suma es: " + vectorC);
	}
}
