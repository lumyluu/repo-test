package trabajoEnClase;

import java.util.Scanner;

//Ejercicio:
//En un juego, suman puntos las vocales en una palabra.
//El usuario define los valores de cada vocal y luego ingresa letra
//por letra de una palabra y se debe mostrar el total de puntos realizado.
//Ejemplo: 
//a:2, e: 3, i: 4, o: 5, u:6
//Si la palabra es:
//CLASE: sumo 2+3 por tener una a y una e
public class EjemploDeChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] valores = { 1, 2, 2, 2, 3 };
		int total = 0;
		System.out.println("Ingrese una palabra");
		String palabra = scan.next();
		for (int i = 0; i < palabra.length(); i++) {
			total += calcularPuntos(palabra.charAt(i), valores);
		}
		System.out.println("el total es " + total);

	}

	private static int calcularPuntos(char letra, int[] puntosLetras) {
		int puntos = 0;
		switch (letra) {
		case 'a':
			puntos = puntosLetras[0];
			break;
		case 'e':
			puntos = puntosLetras[1];
			break;
		case 'i':
			puntos = puntosLetras[2];
			break;
		case 'o':
			puntos = puntosLetras[3];
			break;
		case 'u':
			puntos = puntosLetras[4];
			break;
		}
		return puntos;
	}
}
