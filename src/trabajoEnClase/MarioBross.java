package trabajoEnClase;

import java.util.Scanner;

/*Tenemos un tablero de un juego de 10 x 5 en donde tenemos que ubicar a 
 * nuestro personaje (Mario Bross, Pacman, o que deseen). Se desea ingresar las coordenadas 
 * de la ubicacion (2 valores) por teclado y luego mostrar la matriz imprimiendo 0 cuando 
 * la celda esta vacia y 1 donde se
 *  encuentra el personaje
 */
public class MarioBross {
	static int filas = 10;
	static int columnas = 5;
	static int coordenadas[][] = new int[filas][columnas];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean juegoContinua = true;

		coordenadas[0][0] = 1;
		mostrarTablero();
		while (juegoContinua) {

			moverPersonaje();
			mostrarTablero();
			juegoContinua = continuaJugando();
		}

	}

	private static boolean continuaJugando() {
		boolean juegoContinua;
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Desea continuar jugando? coloca True para seguir.");
		juegoContinua = scanner.nextBoolean();
		return juegoContinua;
	}

	private static void moverPersonaje() {
		Scanner scanner = new Scanner(System.in);
		int filaSelec, columnaSelec;

		System.out.println("Ingrese una coordenada (fila)");
		filaSelec = scanner.nextInt();
		System.out.println("Ingrese una coordenada (columna)");
		columnaSelec = scanner.nextInt();
		coordenadas[filaSelec][columnaSelec] = 1;
	}

	private static void mostrarTablero() {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(coordenadas[i][j]);
			}
			System.out.println();
		}
	}
}
