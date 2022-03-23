package pruebaherencia;

public class AppTienda {
	public static void main(String[] args) {
		Limpieza lim1 = new Limpieza("Marta", 4007821, 30);
		System.out.println(lim1.getNombre() + " " + lim1.getDni() + " " + lim1.getHorasSemanales());
		Administrativo admin1 = new Administrativo("Mariel", 38903672, 3);
		System.out.println(admin1.getNombre() + " " + admin1.getDni() + " " + admin1.getAntiguedad());
		Vendedor vend1 = new Vendedor("Mario", 35678271, 20);
		System.out.println(vend1.getNombre() + " " + vend1.getDni() + " " + vend1.getComision());
	}
}
