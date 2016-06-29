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
import br.com.home.entity.SolicitarServico;
import br.com.home.security.UsuarioSessao;
import br.com.home.service.ServicoService;
import br.com.home.service.SolicitarServicoService;

@Controller
@Path("/protected/servico")
public class solicitarServicoController {

	@Autowired
	SolicitarServicoService solicitacaoService;
	
	@Autowired
	ServicoService servicoService;
	
	@Autowired
	UsuarioSessao usuarioSessao;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/solicitarServico")
	public void salvarSolicitacaoServico(SolicitarServico solicitarServico){
		solicitarServico.setAluno(usuarioSessao.getAlunoLogado());
		solicitacaoService.salvarSolicitacaoServico(solicitarServico);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/listarServicos")
	public List<SolicitarServico> getMeusServicos(){
		Aluno aluno = usuarioSessao.getAlunoLogado();
		return solicitacaoService.getServicos(aluno.getCodigo());
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/servicos")
	public List<SolicitarServico> getServicos(){
		return servicoService.getServicos();
	}

}
