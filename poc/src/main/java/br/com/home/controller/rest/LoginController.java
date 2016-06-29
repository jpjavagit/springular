package br.com.home.controller.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.home.entity.Aluno;
import br.com.home.security.UsuarioSessao;
import br.com.home.service.AlunoService;

@Controller
@Path("/login")
public class LoginController {
	
	@Autowired
	AlunoService alunoService;
	
	@Autowired
	UsuarioSessao usuarioSessao;
	
	private String url;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/logar")
	public Aluno logarUsuario(Aluno aluno){
		
		Aluno loginRetorno = alunoService.getAlunoPorEmail(aluno);
		
		if(loginRetorno != null && !loginRetorno.getEmail().isEmpty()){
			loginRetorno.setLogado(true);
			loginRetorno.setUrl("index.html");
			usuarioSessao.setUsuarioLogado(loginRetorno);
		}else{
			loginRetorno = new Aluno();
			loginRetorno.setLogado(false);
		}
		return loginRetorno;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
