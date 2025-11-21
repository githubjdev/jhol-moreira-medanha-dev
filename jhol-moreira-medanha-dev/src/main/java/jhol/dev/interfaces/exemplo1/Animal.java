package jhol.dev.interfaces.exemplo1;

public interface Animal extends Servivo {

	void emitirSom();
	
	default void dormir() {
		System.out.println(" ZZZ... ");
	}

}
