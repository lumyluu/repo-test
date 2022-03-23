package trabajoEnClase;
//Ejercicio 2 static:Generar la clase auto con los atributos marca, velocidad, cantidad de

//ruedas Identificar un atributo static: Generar el metodo acelerar teniendo en 
//cuenta que debe existir tambien una velocidad maxima
//No se podra sobrepasar esa velocidad para ningun automovil de esta clase
//Instanciar 2 objetos de la clase y ejecutar los metodos necesarios incluyendo acelelerar para luego mostrar la velocidad 
//en diferentes momentos del objeto vehiculo

public class AutoApp {

	public static void main(String[] args) {
		BotellaPrivada botella1 = BotellaPrivada.botellaPublica();
		Auto auto1 = new Auto();
		auto1.setMarca("Fiat");
		auto1.setRuedas(4);
		auto1.setVelocidad(0);

		Auto auto2 = new Auto();
		auto2.setMarca("Chevrolet");
		auto2.setRuedas(4);
		auto2.setVelocidad(0);

		for (int i = 0; i <= 140; i += 10) {
			auto1.acelerar(10);
			auto2.acelerar(5);
		}
	}

}
