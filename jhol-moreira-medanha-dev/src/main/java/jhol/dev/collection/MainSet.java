package jhol.dev.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
	
	
	public static void main(String[] args) {
		
		/*Evita dados duplicados*/
		Set<String> emails = new HashSet<String>();
		emails.add("alex@gmail.com");
		emails.add("jhol@gmail.com");
		emails.add("jose@gmail.com");
		emails.add("alex@gmail.com");
		
		
		for (String email : emails) {
			System.out.println(email);
		}
		
		
		System.out.println("----------------------------------------------");
		
		Set<Pedido> pedidos = new HashSet<Pedido>();
		
		pedidos.add(new Pedido("P1", "OK")); /*Adiciona na lista*/
		pedidos.add(new Pedido("P2", "CONCLUIDO"));
		pedidos.add(new Pedido("P5", "CANCELADO"));
		pedidos.add(new Pedido("P4", "OK"));
		pedidos.add(new Pedido("P5", "CANCELADO"));
		
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
		
		
	}

}
