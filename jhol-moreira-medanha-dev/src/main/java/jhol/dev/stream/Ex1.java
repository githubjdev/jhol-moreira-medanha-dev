package jhol.dev.stream;

import java.util.List;

public class Ex1 {
	
	public static void main(String[] args) {
		
      List<Usuario> usuarios = List.of(new Usuario("Alex", false),
							    		  new Usuario("Alex", false),
							    		  new Usuario("joão", true),
							    		  new Usuario("mario", false),
							    		  new Usuario("paula", true));		
      
      /*Filtrar pelos usuário ativos*/
      List<Usuario> ativos = usuarios.stream().filter(Usuario::isAtivo).toList();
      
      ativos.forEach(u -> System.out.println("User : " + u.getNome() + " ativo: " + u.isAtivo()));
      
      
     /*for (Usuario usuario : ativos) {
		System.out.println("User : " + usuario.getNome() + " ativo: " + usuario.isAtivo());
	 }*/
      
		
	}

}
