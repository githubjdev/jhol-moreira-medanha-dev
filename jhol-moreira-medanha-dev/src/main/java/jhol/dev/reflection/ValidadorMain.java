package jhol.dev.reflection;

import java.lang.reflect.Field;

public class ValidadorMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		
		Usuario usuario = new Usuario();
		usuario.setNome("Alex");
		
		/*Validador de campos null*/
		for (Field atributo : usuario.getClass().getDeclaredFields()) {
			atributo.setAccessible(true);
			if (atributo.get(usuario) == null) {
				System.out.println("Campo " + atributo.getName() + " está vazio.");
			}
		}

	}

}
