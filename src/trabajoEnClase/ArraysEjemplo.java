package trabajoEnClase;

import java.util.Scanner;

public class ArraysEjemplo {
	public static void main(String[] args) {

		// int dias []= {1,2,3,4,5};
		double ingresos[] = new double[5];
		int opcion = 1;
		int dia = 0;
		double ingreso = 0;
		Scanner scanner = new Scanner(System.in);

		while (opcion != 0) {
			System.out.println("Ingrese una opcion para continuar 1. agregar 2. listar 3. modificar 0. salir");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("ingrese el dia");
				dia = scanner.nextInt();
				System.out.println("Ingrese monto");
				ingreso = scanner.nextDouble();
				ingresos[dia - 1] = ingreso;
				break;
			case 2:

				listar(ingresos);
				break;

			case 3:

				System.out.println("ingrese el dia");
				dia = scanner.nextInt();
				System.out.println("Ingrese monto");
				ingreso = scanner.nextDouble();
				ingresos[dia - 1] = ingreso;
				break;

			default:
				System.out.println("Ingrese una opcion valida");

			}

		}

	}

	public static void listar(double[] ingresos) {
		for (int i = 0; i < ingresos.length; i++) {
			System.out.println("dia " + i + ": " + ingresos[i]);
		}
	}
}
