package trabajopractico2;

import java.util.Scanner;

//Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
//las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
//hora se considera como excedente y se paga el doble. Construya el diagrama de flujo, el
//pseudocódigo.
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double hsXDia, hsTotales, pagoHora, hsExtra, liquidacion, hsMax;
		hsMax = 40;

		System.out.println("Ingrese el valor por hora laboral");
		pagoHora = scanner.nextDouble();

		System.out.println("Ingrese las horas trabajadas por día");
		hsXDia = scanner.nextDouble();

		hsTotales = hsXDia * 6;

		if (hsTotales > hsMax) {
			hsExtra = hsTotales - hsMax;
			liquidacion = hsMax * pagoHora;
			liquidacion += +(hsExtra * pagoHora * 2);
		} else {

			liquidacion = hsTotales * pagoHora;

		}

		System.out.println("El pago por hora de tus servicios son: " + pagoHora);
		System.out.println("Tus horas trabajas por día son: " + hsXDia);
		System.out.println("Tus horas trabajadas totales: " + hsTotales);
		System.out.println("Su liquidación es: " + liquidacion);
	}
}
