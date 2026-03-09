package jhol.dev.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainUser {

	public static void main(String[] args) {
		
		Class<Usuario> classe = Usuario.class;
		
		
		System.out.println("Como mostrar os atributos: ");
		for ( Field atributo : classe.getDeclaredFields()) {
			 System.out.println("Atributo: " + atributo.getName());
		}
		
		
		System.out.println("Descobrir os métodos");
		
		 for (Method metodo : classe.getDeclaredMethods()) {
			System.out.println("Método: "+ metodo.getName());
		}

	}

}
