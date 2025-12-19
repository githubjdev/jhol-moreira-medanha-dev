package jhol.dev.generics.record;

public record Produto(String nome, double preco) {

	public Produto{
		if (preco <= 0) {
			throw new IllegalArgumentException("Valor não pode ser zero");
		}
	}

}
