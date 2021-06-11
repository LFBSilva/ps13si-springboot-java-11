package br.com.fiap.ps13si.dto;

import br.com.fiap.ps13si.model.FormularioEntity;

public class RequisicaoNovoFormulario {

	private String empresa;
	private String curso;
	private String email;
	private String telefone;
	private String data;
	private String local;
	
	public RequisicaoNovoFormulario() {
		super();
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public RequisicaoNovoFormulario(String empresa, String curso, String email, String telefone, String data,
			String local) {
		super();
		this.empresa = empresa;
		this.curso = curso;
		this.email = email;
		this.telefone = telefone;
		this.data = data;
		this.local = local;
	}
	
	public FormularioEntity toFormulario() {
		FormularioEntity formulario = new FormularioEntity();
		formulario.setEmpresa(this.empresa);
		formulario.setCurso(this.curso);
		formulario.setEmail(this.email);
		formulario.setTelefone(this.telefone);
		formulario.setData(this.data);
		formulario.setLocal(this.local);
		return formulario;
		}
	
}
