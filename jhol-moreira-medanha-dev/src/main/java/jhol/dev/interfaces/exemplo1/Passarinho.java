package jhol.dev.interfaces.exemplo1;

public class Passarinho implements Animal {

	@Override
	public void respirar() {
		System.out.println(" passaro respirando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(" piu piu");
		
	}

}
