package jhol.dev.stream;

public class Usuario {

	private String nome;
	private boolean ativo;
	private String login;
	private String senha;

	public Usuario(String nome, boolean ativo) {
		super();
		this.nome = nome;
		this.ativo = ativo;
	}

	public Usuario(String nome, boolean ativo, String login, String senha) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
