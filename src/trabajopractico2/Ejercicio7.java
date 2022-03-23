package trabajopractico2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		double promedio, becaUni1, becaUni2, becaUni3, becaSec1, becaSec2, becaSec3;

		becaUni1 = 2000.00;
		becaUni2 = 1000.00;
		becaUni3 = 500.00;

		becaSec1 = 3000.00;
		becaSec2 = 2000.00;
		becaSec3 = 100.00;

		System.out.println("Ingrese su edad");
		edad = scanner.nextInt();
		System.out.println("Ingrese su promedio");
		promedio = scanner.nextDouble();

		if (edad > 18) {
			if (promedio >= 9) {
				System.out.println("Tu beca es de: " + becaUni1);
			} else if (promedio >= 7.5 && promedio < 9) {
				System.out.println("Tu beca es de: " + becaUni2);
			} else if (promedio < 7.5 && promedio >= 6) {
				System.out.println("Tu beca es de: " + becaUni3);
			} else if (promedio < 6) {
				System.out.println("Te invitamos a esforzarte más para recibir la beca de estudio ¡Vos podés!");
			}
		} else {
			if (promedio >= 9) {
				System.out.println("Tu beca es de: " + becaSec1);
			} else if (promedio < 9 && promedio >= 8) {
				System.out.println("Tu beca es de: " + becaSec2);
			} else if (promedio < 8 && promedio >= 6) {
				System.out.println("Tu beca es de: " + becaSec3);
			} else if (promedio < 6) {
				System.out.println("Te invitamos a esforzarte más para recibir la beca de estudio ¡Vos podés!");
			}
		}

	}
}