package trabajopractico2;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		double dineroDisponible, valorKm, totalKm;
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Cu�nto dinero tiene disponible?");
		dineroDisponible = scanner.nextDouble();

		System.out.println("�Cu�nto es el valor del kil�metro?");
		valorKm = scanner.nextDouble();
		totalKm = dineroDisponible / valorKm;

		System.out.println("Total de kilometros" + totalKm);

		if (totalKm > 750) {
			System.out.println("Usted puede ir a M�xico");
		}
		if (totalKm > 800) {
			System.out.println("Usted puede ir a P.V");
		}
		if (totalKm > 1200) {
			System.out.println("Usted puede ir a Acapulco");
		}
		if (totalKm > 1800) {
			System.out.println("Usted puede ir a Canc�n");
		} else {

			System.out.println("Quedate en casa, sos pobre. ");
		}
	}
}
