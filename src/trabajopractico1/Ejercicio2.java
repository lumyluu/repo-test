package trabajopractico1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		double dineroMexicano, valorDolar, totalDolares;

		Scanner scanner = new Scanner(System.in);

		System.out.println("ingrese dinero mexicano: ");
		dineroMexicano = scanner.nextDouble();
		System.out.println("Ingrese el valor del dolar: ");
		valorDolar = scanner.nextDouble();
		totalDolares = dineroMexicano / valorDolar;
		System.out.println("El total de dolares es: " + totalDolares);
	}

}
