package jhol.dev.generics.record;

public class MainProduto {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Teclado", 5);
		
		
		System.out.println(produto.nome());
		System.out.println(produto.preco());
	}

}
