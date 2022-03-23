package trabajopractico2;
//Realice un algoritmo para determinar si una persona puede votar con base en su edad

//en las próximas elecciones. Construya el diagrama de flujo y el pseudocódigo.

import java.util.Scanner;

public class EjercicioUno {
	public static void main(String[] args) {
		int edad = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Coloque su edad");

		edad = scanner.nextInt();

		if (edad <= 16) {

			System.out.println("No puede votar");

		} else {

			System.out.println("Puede votar");

		}

	}

}
