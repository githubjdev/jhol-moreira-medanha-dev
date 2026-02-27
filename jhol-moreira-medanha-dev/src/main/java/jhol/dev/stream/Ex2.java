package jhol.dev.stream;

import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
		  /*Carregar do banco, de uma integração, de qualquer lugar*/
	      List<Usuario> usuarios = List.of(new Usuario("Alex", false, "admin", "admin"),
								    		  new Usuario("Alex", false, "4sds4", "54544"),
								    		  new Usuario("joão", true, "8e84", "45w4s"),
								    		  new Usuario("mario", false, "sd6s6d", "4s6sd"),
								    		  new Usuario("paula", true, "8wds7d", "8s9d8s"));	
	      
	      /*Manda para o front-end com apenas os nomes dos usuários, protegendo os outros dados*/
	      List<String> nomesProduto = usuarios.stream().map(Usuario::getNome).toList();
	      
	      for (String nome : nomesProduto) {
			System.out.println(nome);
		}
		
	}

}
