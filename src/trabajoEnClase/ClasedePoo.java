package trabajoEnClase;

import java.util.Scanner;

// metodos = verbos --> Eje: caminar, correr,
//atributos (estado) = sustantivos ( valores)--> Eje: altura de persona. Suelen ser privados
// clase: molde --> Eje: Persona.
public class ClasedePoo {
	public static void main(String[] args) {

		// Instancia la clase Scanner --> se genera un objeto en memoria
		// la palabra clave NEW instancia un objeto de esa clase
		// tipoDato variable = new tipoDato();-->Ejemplo

		Scanner sc = new Scanner(System.in); // el tipo de dato de sc es Scanner
		// sc.nextInt();
		int numero = 1000;// el tipo de dato de numero es int
		// int es un tipo de dato primitivo. No se puede instanciar.
		// Solo se instancian las clases o los arrays
		int numero1 = 9;
		// invocación de un metodo de instancia

		String palabra1 = "uno"; // solo para String puedo generar objetos con ""
		String palabra2 = new String("dos");

		System.out.println(palabra1);
		System.out.println(palabra2);
		String arrString[] = new String[4];
		arrString[0] = palabra1;
		arrString[1] = palabra2;
		System.out.println(arrString);

		int n1 = 1;
		int n2 = 2;
		int arrInt[] = new int[2];
		arrInt[0] = n1;
		arrInt[1] = n2;

	}
}
