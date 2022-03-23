package trabajopractico1;
/*Realice un diagrama de flujo y pseudocódigo que representen el 
algoritmo para obtener el área de un triángulo.*/

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;


public class Ejercicio1 {

	@SuppressWarnings("lala")
	public static void main(String[] args) {
		int area, base, altura;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresar base: ");
		base = scanner.nextInt();

		System.out.println("Ingrese altura: ");
		altura = scanner.nextInt();

		area = (base * altura) / 2;
		System.out.println("el area es " + area);

	}

}
