package almacen;

public class AppAlmacen {

	public static void main(String[] args) {

		Pan pan = new Pan(10d);
		pan.setNombre("francés");
		for (int i = 0; i < 20; i++) {
			pan.vender();
		}

		Leche leche = new Leche(10);
		leche.setNombre("Las tres niñas");
		for (int i = 0; i < 20; i++) {
			leche.vender();
		}

		Galletitas galletita = new Galletitas(10);
		galletita.setNombre(" Pitusas");
		for (int i = 0; i < 20; i++) {
			galletita.vender();
		}

	}

}
