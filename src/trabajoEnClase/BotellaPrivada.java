package trabajoEnClase;

public class BotellaPrivada {
	private BotellaPrivada() {

	}

	public static BotellaPrivada botellaPublica() {
		return new BotellaPrivada();
	}
}
