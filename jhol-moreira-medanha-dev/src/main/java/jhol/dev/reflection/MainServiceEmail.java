package jhol.dev.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainServiceEmail {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		
		Class classe = Class.forName("jhol.dev.reflection.ServiceEmail");
		
		/*Instancia desse objeto*/
		Object obj = classe.getDeclaredConstructor().newInstance();
		
		/*Pega o método*/
		Method method = classe.getMethod("enviar");
		
		/*Invocando o método*/
		method.invoke(obj);
		
	}

}
