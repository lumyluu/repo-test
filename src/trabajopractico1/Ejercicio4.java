package trabajopractico1;

public class Ejercicio4 {

	public static void main(String[] args) {

		int hora, minutos = 0;
		double valorPorHora, total = 0;

		minutos = Integer.valueOf(args[0]);
		hora = Integer.valueOf(args[1]);
		valorPorHora = Double.valueOf(args[2]);

		total = valorPorHora * hora;

		if (minutos > 0) {

			total += valorPorHora;

		}

		System.out.println("total de la llamada: " + total);

	}

}
