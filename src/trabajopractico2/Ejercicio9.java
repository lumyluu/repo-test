package trabajopractico2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double planA, planB, totalPagar, planElegido;
		double recargoAlcohol, recargoLentes, recargoEnfermedad, recargoEdad;
		int edad;
		String respuesta;

		planA = 1200;
		planB = 950;
		totalPagar = 0;
		recargoAlcohol = 0.10;
		recargoLentes = 0.05;
		recargoEnfermedad = 0.05;
		recargoEdad = 0.20;

		System.out.println("¿Qué plan te interesa? Plan A ( cobertura amplia), Plan B ( daños a terceros)");
		respuesta = scanner.nextLine();
		if ("plan A".equalsIgnoreCase(respuesta)) {
			planElegido = planA;
		} else {
			planElegido = planB;
		}
		System.out.println(+planElegido);
		totalPagar = planElegido;

		System.out.println("¿Es mayor a 40 años?");
		respuesta = scanner.nextLine();
		if ("si".equalsIgnoreCase(respuesta)) {
			totalPagar += +planElegido * recargoEdad;
		}
		System.out.println("Total a pagar: " + totalPagar);

		System.out.println("¿Usted bebe alcohol?");
		respuesta = scanner.nextLine();
		if ("si".equalsIgnoreCase(respuesta)) {
			totalPagar += +planElegido * recargoAlcohol;
		}
		System.out.println("Total a pagar: " + totalPagar);

		System.out.println("¿Usted debe usar lentes?");
		respuesta = scanner.nextLine();
		if ("sis".equalsIgnoreCase(respuesta)) {
			totalPagar += +planElegido * recargoLentes;
		}
		System.out.println("Total a pagar: " + totalPagar);

		System.out.println("¿Usted tiene alguna enfermedad?");
		respuesta = scanner.nextLine();
		if ("si".equalsIgnoreCase(respuesta)) {
			totalPagar += +planElegido * recargoEnfermedad;
		}
		System.out.println("Total a pagar: " + totalPagar);

	}
}
