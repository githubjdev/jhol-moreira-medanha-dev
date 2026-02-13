package jhol.dev.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainSort {
	
	
	public static void main(String[] args) {
		
		List<Pedido> pedidos = new ArrayList<Pedido>();

		pedidos.add(new Pedido("P2", "CONCLUIDO"));
		pedidos.add(new Pedido("P3", "CANCELADO"));
		pedidos.add(new Pedido("P1", "OK")); /* Adiciona na lista */
		pedidos.add(new Pedido("P5", "CANCELADO"));
		pedidos.add(new Pedido("P4", "OK"));
		
		
		pedidos.sort(Comparator.comparing(Pedido::getId));
		
		
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
		
	}

}
