package trabajoEnClase;

import java.util.Scanner;

public class EjercicioChar2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char arregloPalabra[];
		int suma = 0;

		System.out.println("Ingrese palabra");

		arregloPalabra = scanner.next().toCharArray();

		for (int i = 0; i < arregloPalabra.length; i++) {
			char letra = arregloPalabra[i];
			/*
			 * if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) ==
			 * 'e' || Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) ==
			 * 'o' || Character.toLowerCase(letra) == 'u') { suma++; }
			 */
			switch (Character.toLowerCase(letra)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				suma++;
				break;
			default:
				System.out.println("No es una vocal");
			}
		}
		System.out.println("La cantidad de vocales es: " + suma);
	}
}
