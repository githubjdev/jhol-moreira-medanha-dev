package jhol.dev.collection;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
	
	
	public static void main(String[] args) {
		
		Map<String, Pedido> map = new HashMap<String, Pedido>();
		
		map.put("Alex Fernando", new Pedido("P1", "FAZENDO"));
		map.put("Jhol", new Pedido("P2", "CONCLUIDO"));
		
		for (String key : map.keySet()) {
			
			Pedido pedido = map.get(key);
			
			System.out.println("Cliente: " + key + " - Pedido: " + pedido.getId() + " - Situação: " + pedido.getStatus());
			
		}
		
	}

}
