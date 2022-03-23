package trabajopractico2;

import java.util.Scanner;
//El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le	permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
//Las tarifas que se tienen son las siguientes:
//a. Las dos primeras horas a $5.00 c/u.
//b. Las siguientes tres a $4.00 c/u.
//c. Las cinco siguientes a $3.00 c/u.
//d. Después de diez horas el costo por cada una es de dos pesos.

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double hs, total = 0d;
		System.out.println("Ingrese horas");
		hs = scanner.nextDouble();

		if (hs <= 2) {
			total = hs * 5;

		} else if (hs > 2 && hs < 5) {
			total = hs * 4;

		} else if (hs > 5 && hs <= 10) {
			total = hs * 3;

		} else if (hs > 10) {
			total = hs * 2;
		}

		System.out.println("Total a pagar " + total);
	}
}
