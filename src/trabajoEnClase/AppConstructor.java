package trabajoEnClase;

public class AppConstructor {
	public static void main(String[] args) {

		Limpieza lim1 = new Limpieza("Marta", 40078234, 30);
		System.out.println(lim1.getNombre());
		lim1.set

		Persona per1 = new Persona("ABC");
		System.out.println(per1.getNombre());
		Persona per2 = new Persona("XYZ", 160);
		System.out.println(per2.getNombre());
		System.out.println(per2.getAltura());

		Persona per0 = Persona.crearObjeto();
	}
}
