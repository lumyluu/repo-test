package trabajoEnClase;

public class AppCurso {
	public static void main(String[] args) {
		Curso cursos[] = new Curso[4];
		Curso c1 = new Curso();
		c1.setNombre("Curso1");
		c1.setCapacidadMaxima(100);
		c1.setInscriptos(2);

		Curso c2 = new Curso();
		c2.setNombre("Curso2");
		c2.setCapacidadMaxima(200);
		c2.setInscriptos(4);

		cursos[0] = c1;
		cursos[1] = c2;

		System.out.println(c2.getCapacidadMaxima());

	}
}
