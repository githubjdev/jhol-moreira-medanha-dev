package jhol.dev.collection;

import java.util.ArrayList;
import java.util.List;

public class MainPedido2 {
	
	public static void main(String[] args) {
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		pedidos.add(new Pedido("P1", "OK")); /*Adiciona na lista*/
		pedidos.add(new Pedido("P2", "CONCLUIDO"));
		pedidos.add(new Pedido("P3", "CANCELADO"));
		pedidos.add(new Pedido("P4", "OK"));
		pedidos.add(new Pedido("P5", "CANCELADO"));
		
		for (Pedido pedido : pedidos) {
			System.out.println("ID:" + pedido.getId() + " - Status: " + pedido.getStatus());
		}
		
		System.out.println("--------------------------------------------------------");
		
		pedidos.removeIf(p -> "CANCELADO".equals(p.getStatus())); /*Remove atráves de uma condição*/
		
		
		for (Pedido pedido : pedidos) {
			System.out.println("ID:" + pedido.getId() + " - Status: " + pedido.getStatus());
		}
		
		
		//pedidos.add(null); /*Adiciona de um em um*/
		//pedidos.addAll(pedidos);/*Adiciona uma lista dentro de outra*/
		//pedidos.clear(); /*Limpa a lista*/
		//pedidos.isEmpty(); /*verifica se a lista está vazia*/
		//pedidos.contains(pedidos); /*Verifica se o obejeto já est*/
		
		
	}

}
