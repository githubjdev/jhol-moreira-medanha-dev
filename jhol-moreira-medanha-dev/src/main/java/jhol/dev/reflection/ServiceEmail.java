package jhol.dev.reflection;

public class ServiceEmail {
	
	
	private String token;

	@Executar
	public void enviar() {
		System.out.println("Enviando e-mail");
	}
	
	
	public void setToken(String token) {
		this.token = token;
	}
	
	@Ignore
	public String getToken() {
		return token;
	}
}
