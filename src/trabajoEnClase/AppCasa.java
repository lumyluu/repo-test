package trabajoEnClase;
//Generar una clase Casa con los atributos:

//int m2cubiertos; String calle; int altura;
//Generar al menos 3 constructores e instanciar 3 objetos desde un main utilizando
//los diferentes metodos creados. Mostrar los datos de los objetos por pantalla

public class AppCasa {
	public static void main(String[] args) {
		Casa casa1 = new Casa();
		Casa casa2 = new Casa("Ancon");
		Casa casa3 = new Casa("Ancon", 255);
		Casa casa4 = new Casa("Ancon", 255, 70);
		System.out.println(casa4.getCalle());
		System.out.println(casa4.getAltura());
		System.out.println(casa4.getM2Cubiertos());

	}
}
