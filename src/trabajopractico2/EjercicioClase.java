package trabajopractico2;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {

		double costoTraje = 0, precioFinal = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese valor: ");

		if (costoTraje < 2500) {

			precioFinal = (costoTraje * 0.8) + costoTraje;

		} else {
			precioFinal = (costoTraje * 0.15) + costoTraje;
		}
		System.out.println("Precio final: " + precioFinal);
	}
}
