package trabajopractico2;

import java.util.Scanner;
//Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de menor edad. Realice el algoritmo correspondiente y represéntelo con un
//	diagrama de flujo y pseudocódigo

public class Ejercicio5 {
	public static void main(String[] args) {
		int edades[] = new int[3];
		String nombres[] = new String[3];
		int edadMinima;
		int posicion = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingresar nombre");
			nombres[i] = scanner.next();

			System.out.println("Ingresar edad");
			edades[i] = scanner.nextInt();
		}
		edadMinima = edades[0];

		for (int i = 0; i < 3; i++) {
			if (edadMinima > edades[i]) {
				edadMinima = edades[i];
				posicion = i;
			}

		}

		System.out
				.println("La persona con menor edad es: " + nombres[posicion] + " " + "con la edad de: " + edadMinima);

	}
}
