package trabajopractico2;

import java.util.Scanner;

//El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia
//en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que
//tiene son las siguientes:
//REGALO COSTO
//Tarjeta $10.00 o menos
//Chocolates $11.00 a $100.00
//Flores $101.00 a $250.00
//Anillo Más de $251.00
//Se requiere un diagrama de flujo con el algoritmo que ayude a determinar qué regalo se le
//	puede comprar a ese ser tan especial por el día del amor y la amistad.
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double dinero;
		System.out.println("Ingrese su dinero disponible para gastar");
		dinero = scanner.nextDouble();

		if (dinero > 0 && dinero <= 10.00) {

			System.out.println("Comprale una tarjeta. Eres la cáscara de mi banana");

		} else if (dinero >= 11.00 && dinero <= 100.00) {
			System.out.println("Comprale chocobascas");
		} else if (dinero >= 101.00 && dinero <= 250.00) {
			System.out.println("Comprale flores");
		} else if (dinero >= 251.00) {
			System.out.println("Comprale un anillo.");

		}

	}
}
