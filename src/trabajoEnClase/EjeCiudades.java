package trabajoEnClase;

import java.util.Scanner;

//Ejercicio:
//
//En un trayecto entre dos ciudades se deben realizar paradas intermedias. 
//Se debe ingresar cuantas paradas se van a realizar en el viaje 
//y la longitud de los trayectos en kilometros. 
//Se desea conocer la longitud
//promedio entre ciudades y 
//cuales son las paradas mas cercanas

//ejemplo
//
//*------- * ---------------- * ----- * ----------- *
//   40            100            15      60
public class EjeCiudades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int paradas;
		double promedio = 0;
		double longitudTotal = 0;
		double minimo = 0;

		System.out.println("Ingrese cantidad de paradas: ");
		paradas = scanner.nextInt();

		double[] trayectoKM = new double[paradas];
		for (int i = 0; i < trayectoKM.length; i++) {

			System.out.println("Ingrese km de paradas número " + i);
			trayectoKM[i] = scanner.nextDouble();
		}
		;
		for (int i = 0; i < trayectoKM.length; i++) {

			longitudTotal += trayectoKM[i];
		}

		promedio = longitudTotal / paradas;
		minimo = trayectoKM[0];

		for (int i = 0; i < trayectoKM.length; i++) {
			if (minimo > trayectoKM[i]) {
				minimo = trayectoKM[i];
			}
		}
		System.out.println("cantidad de paradas: " + paradas + "\npromedio: " + promedio + "\nTotal long:"
				+ longitudTotal + "\nMinimo: " + minimo);

		for (int i = 0; i < trayectoKM.length; i++) {
			System.out.println("trayecto " + i + ": " + trayectoKM[i]);

		}
	}
}
