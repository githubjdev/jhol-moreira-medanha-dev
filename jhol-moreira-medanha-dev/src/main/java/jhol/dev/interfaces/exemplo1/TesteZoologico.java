package jhol.dev.interfaces.exemplo1;

public class TesteZoologico {
	
	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		Animal passa = new Passarinho();
		
		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(cachorro);
		zoologico.interagirComAnimal(gato);
		zoologico.interagirComAnimal(passa);
	}

}
