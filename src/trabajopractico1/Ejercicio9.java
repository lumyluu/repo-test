package trabajopractico1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		double tiempoLlamada, costoMinutos, total;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese tiempo llamada: ");

		tiempoLlamada = scanner.nextDouble();

		System.out.println("Ingrese costo minutos: ");

		costoMinutos = scanner.nextDouble();

		total = tiempoLlamada * costoMinutos;

		System.out.println("Su gasto es: $" + total);

	}
}
