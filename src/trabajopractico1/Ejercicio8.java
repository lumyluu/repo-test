package trabajopractico1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double velocidadConstante = 0, distancia = 0, tiempoTotal;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese velocidad constante: ");

		velocidadConstante = scanner.nextDouble();

		System.out.println("Ingrese distancia: ");

		distancia = scanner.nextDouble();

		tiempoTotal = distancia / velocidadConstante;

		System.out.println("El tiempo total es: " + tiempoTotal);

	}
}
