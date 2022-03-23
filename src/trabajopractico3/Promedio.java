package trabajopractico3;

import java.util.Random;
import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamaño;
		String nombreAuxiliar;
		int promedioAuxiliar;
		System.out.println("¿Cuántos estudiantes son?");
		tamaño = scanner.nextInt();
		Random random = new Random();

		String nombres[] = new String[tamaño];
		int promedio[] = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			System.out.println("Ingrese el nombre del/la estudiante");
			nombres[i] = "Lulu";
			System.out.println("Ingresar promedio");
			promedio[i] = (int) (Math.random() * 10);
			promedio[i] = i;

		}

		for (int i = 0; i < tamaño; i++) {
			for (int j = i + 1; j < tamaño; j++) {
				if (promedio[j] > promedio[i]) {

					System.out.println("I[" + i + "] J[" + j + "]");
					nombreAuxiliar = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = nombreAuxiliar;
					promedioAuxiliar = promedio[i];
					listar(promedio, tamaño);
					promedio[i] = promedio[j];
					listar(promedio, tamaño);
					promedio[j] = promedioAuxiliar;
					listar(promedio, tamaño);
					System.out.println("---------------------");

				}
			}
		}
		for (int i = 0; i < tamaño; i++) {
			System.out.println("ALUMNO: " + nombres[i] + " PROMEDIO: " + promedio[i]);
		}

	}

	private static void listar(int arreglo[], int tamaño) {
		for (int i = 0; i < tamaño; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}
}
