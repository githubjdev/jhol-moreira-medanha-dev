package jhol.dev.composicao;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Alex");
		pessoa.setIdade(38);
		pessoa.getEndereco().setRua("Osvado cruz");
		pessoa.getEndereco().setNumero("50");
		
		
		
	}

}
