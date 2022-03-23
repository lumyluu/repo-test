package trabajoEnClase;

public class EjemploMatriz {

	public static void main(String[] args) {
		// el primer corchete indica la fila, el segundo la columna
		int matriz[][] = new int[4][2]; // 4 filas - 2 columnas
		matriz[0][0] = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				// mostrar cada uno de los valores de la matriz
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}
}
