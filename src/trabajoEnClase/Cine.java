package trabajoEnClase;

import java.util.Scanner;

//Ejercicio 2:
//Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo con un valor 1
//hasta que se ingrese asiento numero 99
//Listar los asientos vendidos
public class Cine {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int asientos[] = new int[49];
		int asientoSeleccionado = 0;

		while (asientoSeleccionado != 99) {
			System.out.println("Ingrese asiento seleccionado: ");

			asientoSeleccionado = scanner.nextInt();
			if (asientoSeleccionado != 99) {
				asientos[asientoSeleccionado] = 1;
			}
		}

		for (int i = 0; i < asientos.length; i++) {
			System.out.println("Asiento " + i + ":" + asientos[i]);
		}

	}

}
