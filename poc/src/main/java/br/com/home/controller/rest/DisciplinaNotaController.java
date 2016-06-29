package br.com.home.controller.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.home.entity.Aluno;
import br.com.home.entity.Disciplina;
import br.com.home.entity.DisciplinaNota;
import br.com.home.security.UsuarioSessao;
import br.com.home.service.DisciplinaNotaService;

@Controller
@Path("/protected/disciplaNota")
public class DisciplinaNotaController {

	@Autowired
	DisciplinaNotaService disciplinaNotaService;
	
	@Autowired
	UsuarioSessao usuarioSessao;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listarNotas/{disciplina}")
	public List<DisciplinaNota> getDisciplinaNota(@PathParam("disciplina") Long disciplina){
		Aluno aluno = usuarioSessao.getAlunoLogado();
		return disciplinaNotaService.getDisciplinasNota(aluno, disciplina);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/alunoSessao")
	public Aluno recuperSessao(){
		return usuarioSessao.getAlunoLogado();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listarDisciplinas")
	public List<Disciplina> getDisciplinas(){
		return disciplinaNotaService.getDisciplinas();
	}
	
}
