package trabajopractico3;

import java.util.Random;
import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tama�o;
		String nombreAuxiliar;
		int promedioAuxiliar;
		System.out.println("�Cu�ntos estudiantes son?");
		tama�o = scanner.nextInt();
		Random random = new Random();

		String nombres[] = new String[tama�o];
		int promedio[] = new int[tama�o];

		for (int i = 0; i < tama�o; i++) {
			System.out.println("Ingrese el nombre del/la estudiante");
			nombres[i] = "Lulu";
			System.out.println("Ingresar promedio");
			promedio[i] = (int) (Math.random() * 10);
			promedio[i] = i;

		}

		for (int i = 0; i < tama�o; i++) {
			for (int j = i + 1; j < tama�o; j++) {
				if (promedio[j] > promedio[i]) {

					System.out.println("I[" + i + "] J[" + j + "]");
					nombreAuxiliar = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = nombreAuxiliar;
					promedioAuxiliar = promedio[i];
					listar(promedio, tama�o);
					promedio[i] = promedio[j];
					listar(promedio, tama�o);
					promedio[j] = promedioAuxiliar;
					listar(promedio, tama�o);
					System.out.println("---------------------");

				}
			}
		}
		for (int i = 0; i < tama�o; i++) {
			System.out.println("ALUMNO: " + nombres[i] + " PROMEDIO: " + promedio[i]);
		}

	}

	private static void listar(int arreglo[], int tama�o) {
		for (int i = 0; i < tama�o; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}
}
