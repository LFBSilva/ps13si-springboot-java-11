package br.com.fiap.ps13si.dto;

import br.com.fiap.ps13si.model.UsuarioEntity;

public class RequisicaoLoginUsuario {

	private String nome;
	private String login;
	private String email;
	private String dataNascimento;
	private String genero;
	private String telefone;
	private String senha;
	
	public RequisicaoLoginUsuario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public RequisicaoLoginUsuario(String nome, String login, String email, String dataNascimento, String genero,
			String telefone, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.telefone = telefone;
		this.senha = senha;
	}
	
	public UsuarioEntity toLogin() {
		UsuarioEntity login = new UsuarioEntity();
		login.setLogin(this.login);;
		login.setSenha(this.senha);
		return login;
		}
	
}
