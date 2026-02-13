package jhol.dev.collection;

import java.util.ArrayList;
import java.util.List;

public class MainPedido {
	
	
	public static void main(String[] args) {
		
		
		List listGenerica = new ArrayList();
		
		listGenerica.add("Alex");
		listGenerica.add(new Pedido("10", "PREPARANDO"));
		
		
		for (Object object : listGenerica) {
			
			if (object instanceof Pedido) {
				Pedido pedido = (Pedido) object;
				System.out.println("Status: " + pedido.getStatus());
			}else {
				System.out.println(object);
			}
		}
		
		
	}

}
