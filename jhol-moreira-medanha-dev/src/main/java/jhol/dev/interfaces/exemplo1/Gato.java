package jhol.dev.interfaces.exemplo1;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("miau miau");

	}

	@Override
	public void dormir() {
		System.out.println("gato domindo na cama");
	}

	@Override
	public void respirar() {
		System.out.println("gato respirando");
		
	}

}
