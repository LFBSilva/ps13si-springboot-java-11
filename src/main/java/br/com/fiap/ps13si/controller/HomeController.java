package br.com.fiap.ps13si.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.ps13si.dto.RequisicaoNovoFormulario;
import br.com.fiap.ps13si.model.CursosEntity;
import br.com.fiap.ps13si.model.FormularioEntity;
import br.com.fiap.ps13si.model.UsuarioEntity;
import br.com.fiap.ps13si.repository.CursosRepository;
import br.com.fiap.ps13si.repository.FormularioRepository;
import br.com.fiap.ps13si.repository.UsuarioRepository;

@Controller
@RequestMapping("ps13si")
public class HomeController {

	@Autowired
	CursosRepository cursosRepository;

	@Autowired
	FormularioRepository formularioRepository;

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("login")
	public ModelAndView ps13si() {
		return new ModelAndView("login");
	}
	
	@GetMapping("home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@GetMapping("bootcamps")
	public ModelAndView bootcamps() {
		return new ModelAndView("bootcamps");
	}
	
	@GetMapping("professores")
	public ModelAndView professores() {
		return new ModelAndView("professores");
	}
	
	@GetMapping("cursos")
	public ModelAndView cursos() {
		return new ModelAndView("cursos");
	}
	
	@GetMapping("fale-conosco")
	public ModelAndView faleConosco() {
		return new ModelAndView("fale-conosco");
	}
	

	@GetMapping("formulario-bootcamp")
	public String abrirFormulario(Model model) {
		List<CursosEntity> cursos = cursosRepository.findAll();
		model.addAttribute("cursos", cursos);
		model.addAttribute("formulario", new RequisicaoNovoFormulario());
		return "formulario-bootcamp";

	}

	@PostMapping("novo-formulario")
	public String novoFormulario(RequisicaoNovoFormulario requisicao, Model model) {
		System.out.println(requisicao.getEmpresa() + requisicao.getCurso() + requisicao.getEmail()
				+ requisicao.getTelefone() + requisicao.getData() + requisicao.getLocal());
		FormularioEntity formulario = requisicao.toFormulario();
		formularioRepository.save(formulario);
		List<FormularioEntity> formularios = formularioRepository.findAll();
		model.addAttribute("formularios", formularios);
		return "bootcamps";
	}

	@GetMapping("formularios")
	public String formularios(Model model) {
		List<FormularioEntity> formularios = formularioRepository.findAll();
		model.addAttribute("formularios", formularios);
		return "bootcamps";
	}
	
	@PostMapping("/efetuarLogin")
	public String efetuarLogin(UsuarioEntity usuario) {
		if(usuario.getLogin().equals("admin") && usuario.getSenha().equals("123456")) {
			return "/ps13si/home";
		} else {
			return "/ps13si";
		}
	}

}
