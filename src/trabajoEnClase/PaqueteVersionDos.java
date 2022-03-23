package trabajoEnClase;

import java.util.Scanner;

public class PaqueteVersionDos {
	public static void main(String[] args) {

		double costoPorZona[] = { 11.00, 10.00, 12.00, 24.00, 27.00 };
		double pesoPaquete = 0;
		double costoPorServicio = 0;
		int zona;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingrese el peso del paquete ");
			pesoPaquete = scanner.nextDouble();
			if (pesoPaquete > 5) {
				System.out.println(
						"No podemos transportar pesos mayores a 5kg. Por favor, envíe un paquete de menor peso");
			}
		} while (pesoPaquete > 5);
		System.out.println("Ingrese el número de la zona a enviar el paquete ");
		zona = scanner.nextInt();
		if (zona >= 1 && zona <= 5) {
			costoPorServicio = costoPorZona[zona - 1] * pesoPaquete;
			System.out.println("El costo del servicio es: " + costoPorServicio);
		} else {
			System.out.println("No tenemos servicio para esta zona");
		}
	}
}
