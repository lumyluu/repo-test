package trabajopractico1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		int lado, area;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese lado ");

		lado = scanner.nextInt();

		area = lado * lado;

		System.out.println("Área: " + area);

	}

}
