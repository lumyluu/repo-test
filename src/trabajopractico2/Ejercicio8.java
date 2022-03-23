package trabajopractico2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double antiguedad, sueldo, bonoAnt1, bonoAnt2, bonoSuel1, bonoSuel2, bonoSuel3, bonoAnti, bonoSuel;

		bonoAnt1 = 0.20;
		bonoAnt2 = 0.30;

		bonoSuel1 = 0.25;
		bonoSuel2 = 0.15;
		bonoSuel3 = 0.10;
		bonoAnti = 0;
		bonoSuel = 0;

		System.out.println("Ingrese su antiguedad");
		antiguedad = scanner.nextDouble();

		System.out.println("Ingrese su sueldo");
		sueldo = scanner.nextDouble();

		if (antiguedad > 2 && antiguedad < 5) {

			bonoAnti = sueldo * bonoAnt1;
		} else if (antiguedad >= 5)
			;
		{

			bonoAnti = sueldo * bonoAnt2;
		}

		if (sueldo < 1000) {

			bonoSuel = sueldo * bonoSuel1;
		} else if (sueldo >= 1000 && sueldo <= 3500) {

			bonoSuel = sueldo * bonoSuel2;
		} else if (sueldo > 3500) {

			bonoSuel = sueldo * bonoSuel3;
		}

		if (bonoAnti > bonoSuel) {
			System.out.println("Tu bono por antiguedad es de: " + bonoAnti);
		} else {
			System.out.println("TTu bono por concepto de sueldo es de: " + bonoSuel);
		}

	}
}