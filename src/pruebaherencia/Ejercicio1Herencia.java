package pruebaherencia;

import java.util.Scanner;
// Ejercicio 1 Herencia:

//Generar las clases Triangulo y Rectangulo. Verificar si existen atributos 
//comunes entre ambas que permitan la generacion de una superclase. 
//Implementar el metodo obtenerArea() para cada clase. Mostrar los resultados por pantalla. 
//Si desean tambien tomar la informacion por teclado

public class Ejercicio1Herencia {
	public static void main(String[] args) {
		String nombreFigura;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca el nombre de su figura geométrica");
		nombreFigura = scanner.next();

		if (nombreFigura.equals("triangulo")) {

			Triangulo triangulo = new Triangulo();

			System.out.println("Introduce la base");

			triangulo.setBase(scanner.nextInt());

			System.out.println("Introduce la altura");
			triangulo.setAltura(scanner.nextInt());

			System.out.println("Tu área es: " + triangulo.calcularArea());

		} else if (nombreFigura.equals("rectangulo")) {

			Rectangulo rectangulo = new Rectangulo();

			System.out.println("Introduce la base");
			rectangulo.setBase(scanner.nextInt());

			System.out.println("Introduce la altura");
			rectangulo.setAltura(scanner.nextInt());

			System.out.println("Tu área es: " + rectangulo.calcularArea());
		}

	}

}
