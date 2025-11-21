package jhol.dev.interfaces.exemplo1;

public class Cachorro implements Animal {

	@Override
	public void emitirSom() {
		System.out.println(" AU AU ");
	}

	@Override
	public void respirar() {
		System.out.println("gato respirando");

	}

}
