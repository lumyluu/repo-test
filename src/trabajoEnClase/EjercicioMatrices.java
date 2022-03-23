package trabajoEnClase;

import java.util.Scanner;

public class EjercicioMatrices {
	public static void main(String[] args) {
		System.out.println("Ingrese el importe");
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int centena = total / 100;
		int resto = total % 100;

		int decena = resto / 10;
		int unidad = resto % 10;

		System.out.println("Centena: " + centena);
		System.out.println("Resto: " + resto);
		System.out.println("Decenta: " + decena);
		System.out.println("Unidad: " + unidad);

		if (total % 2 == 0) {
			System.out.println("Es par");

		} else {
			System.out.println("Es impar");
		}
	}
}
