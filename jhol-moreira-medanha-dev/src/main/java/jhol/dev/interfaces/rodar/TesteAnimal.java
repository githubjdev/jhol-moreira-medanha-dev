package jhol.dev.interfaces.rodar;

import jhol.dev.interfaces.exemplo1.Animal;
import jhol.dev.interfaces.exemplo1.Cachorro;
import jhol.dev.interfaces.exemplo1.Gato;

public class TesteAnimal {

	public static void main(String[] args) {

		Animal a1 = new Cachorro();
		Animal a2 = new Gato();

		a1.emitirSom();
		a1.dormir();

		a2.emitirSom();
		a2.dormir();

	}

}
