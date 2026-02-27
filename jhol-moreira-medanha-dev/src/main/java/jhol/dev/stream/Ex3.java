package jhol.dev.stream;

import java.util.List;

import jhol.dev.collection.Pedido;

public class Ex3 {

	public static void main(String[] args) {
		
		List<Pedido> pedidos = List.of(new Pedido("P1", "Processando", 50),
										new Pedido("P2", "Processando", 40),
										new Pedido("P3", "Processando", 200),
										new Pedido("P4", "Processando", 70));
		
		/*Saber a soma do pedidos*/
		double total = pedidos.stream().mapToDouble(Pedido::getValor).sum();
		System.out.println("Soma total dos pedidos: " + total);
		
		double total2 = 0;
		for (Pedido pedido : pedidos) {
		  total2 += pedido.getValor();
		}
		
		System.out.println("Soma total 2: " + total2);
		

	}

}
