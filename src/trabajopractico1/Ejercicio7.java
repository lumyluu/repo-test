package trabajopractico1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		double kilometros = 0, costoPorKilometro = 0, boleto;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese kilometro." + kilometros);

		kilometros = scanner.nextDouble();

		System.out.println("Ingrese costo por kilometro: $" + costoPorKilometro);

		costoPorKilometro = scanner.nextDouble();

		boleto = costoPorKilometro * kilometros;

		System.out.println("Valor boleto $" + boleto);
	}

}
