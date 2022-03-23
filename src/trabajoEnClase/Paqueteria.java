package trabajoEnClase;

import java.util.Scanner;

public class Paqueteria {

	public static void main(String[] args) {

		int zonaEnviosPaquete;
		double costoEnvio = 0;
		double pesoPaquete;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Peso del paquete en gramos: ");
		pesoPaquete = scanner.nextInt();

		if (pesoPaquete > 5) {
			System.out.println("Por medidas de seguridad, no se puede enviar su paquete");
		} else {
			System.out.println("Destino del paquete: 1. AcaNorte 2.AcaCentral 3.AcaSur 4.Europa, 5.Asia");
			zonaEnviosPaquete = scanner.nextInt();
			switch (zonaEnviosPaquete) {

			case 1:
				costoEnvio = pesoPaquete * 11;
				break;
			case 2:
				costoEnvio = pesoPaquete * 10;
				break;
			case 3:
				costoEnvio = pesoPaquete * 12;
				break;
			case 4:
				costoEnvio = pesoPaquete * 24;
				break;
			case 5:
				costoEnvio = pesoPaquete * 27;
				break;

			}
			System.out.println("Peso paquete: " + pesoPaquete + "El valor es $" + costoEnvio);
		}
	}

}
