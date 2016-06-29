package br.com.home.controller.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.home.entity.Aluno;
import br.com.home.service.AlunoService;

@Controller
@Path("/protected/usuario")
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrarUsuario")
	public void salvarUsuario(Aluno aluno){
		alunoService.salvarAluno(aluno);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listarUsuarios")
	public List<Aluno> getAlunos(){
		return alunoService.getAlunos();
	}
	
}
