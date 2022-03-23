package hello;

public class AppClase1 {

	public static void main(String[] args) {

		Docente docente1 = new Docente();
		Docente docente2 = new Docente();

		docente1.setLegajo(40078281);
		docente2.setLegajo(38067432);

		docente1.setNombre("Angela");
		docente2.setNombre("Manuel");

		Administrativo admin1 = new Administrativo();
		Administrativo admin2 = new Administrativo();

		admin1.setCentroDeCosto(1500);
		admin2.setCentroDeCosto(2000);

		admin1.setNombre("Ivana");
		admin2.setNombre("Matias");

		System.out.println("Docente 1: " + docente1.getNombre() + " " + docente1.getLegajo());
		System.out.println("Docente 2: " + docente2.getNombre() + " " + docente2.getLegajo());

		long costo1 = admin1.getCentroDeCostos();
		long costo2 = admin2.getCentroDeCostos();

		String nombreAdmin1 = admin1.getNombre();
		String nombreAdmin2 = admin2.getNombre();

		System.out.println("Admin 1: " + nombreAdmin1 + " " + costo1);
		System.out.println("Admin 2: " + nombreAdmin2 + " " + costo2);

	}
}
