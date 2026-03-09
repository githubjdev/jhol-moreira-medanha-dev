package jhol.dev.reflection;

import java.lang.reflect.Method;

public class Ex3 {

	public static void main(String[] args) throws Exception {

		Class classe = Class.forName("jhol.dev.reflection.ServiceEmail");

		/* Instancia desse objeto */
		Object obj = classe.getDeclaredConstructor().newInstance();
		
		for (Method methodo : obj.getClass().getDeclaredMethods()) {
			if (methodo.isAnnotationPresent(Executar.class)) {
				methodo.invoke(obj);
			}
		}

	}

}
