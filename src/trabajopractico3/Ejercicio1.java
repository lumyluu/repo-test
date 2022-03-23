package trabajopractico3;

import java.util.Scanner;

//Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10
//elementos. 
public class Ejercicio1 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int suma = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese 10 numeros");
			numeros[i] = scanner.nextInt();

			suma += numeros[i];
		}
	}
}
