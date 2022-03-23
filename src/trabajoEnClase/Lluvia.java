package trabajoEnClase;
//Se desea obtener el promedio de lluvias en mm de una ciudad en una semana.

//Calcular el promedio de lluvias durante el fin de 
//semana y durante los dias laborables. Ingresar los valores por teclado.
//Agregado validacion: El total de lluvias del dia puede ser entre 10 y 99 milimetros...

import java.util.Scanner;

public class Lluvia {
	public static void main(String[] args) {

		double dias[] = new double[7];
		double diasLaborales = 0;
		double diasNoLaborales = 0;
		double promedioLaboral = 0;
		double promedioNolaboral = 0;

		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		while (contador < 7) {
			System.out.println("Ingresar lluvia Mm");
			int lluvia = scanner.nextInt();
			if (lluvia > 10 && lluvia < 99) {
				dias[contador] = lluvia;
				contador++;
			} else {
				System.out.println("Dato inválido. La lluvia debe ser entre 10 y 99 milímetros");
			}

		}
		for (int i = 0; i < 7; i++) {
			if (i < 5) {
				diasLaborales += dias[i];
			} else {
				diasNoLaborales += dias[i];
			}
		}
		promedioLaboral = diasLaborales / 5;
		promedioNolaboral = diasNoLaborales / 2;

		System.out.println("Promedio dias laborales: " + promedioLaboral + "\n" + "Promedio dias no laborales: "
				+ promedioNolaboral);
	}
}
