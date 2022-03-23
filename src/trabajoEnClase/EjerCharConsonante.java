package trabajoEnClase;

import java.util.Scanner;

public class EjerCharConsonante {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char palabra[];
		int suma = 0;

		System.out.println("Ingrese una palabra");

		palabra = scanner.next().toCharArray();

		for (int i = 0; i < palabra.length; i++) {
			char letra = palabra[i];
			switch (Character.toLowerCase(letra)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("No es una consonante");
				break;
			default:
				suma++;

			}
		}
		System.out.println("La cantidad de consonantes es: " + suma);
	}
}
