package jhol.dev.generics.exemplo2;

public class TesteResponse {

	public static void main(String[] args) {
		
		//Response<String> resp = new Response<>("OK", "Operação");
		
		//System.out.println(resp.getData());
		
		
		
		Response<Produto> resp2 = new Response<Produto>(new Produto("Macarrão", 50.0), "Sucesso");
		
		System.out.println(resp2.getData().getNome());

	}

}
