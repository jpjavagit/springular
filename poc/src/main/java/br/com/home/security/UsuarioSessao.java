package br.com.home.security;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import br.com.home.entity.Aluno;

@Service
public class UsuarioSessao {

	public void setUsuarioLogado(Aluno aluno){
		
		if(getAlunoLogado()== null){
			RequestContextHolder.getRequestAttributes().setAttribute("usuario", aluno, RequestAttributes.SCOPE_SESSION);
		}
		
	}
	
	/**
	 * Recupera a sessão
	 * @return Aluno
	 */
	public Aluno getAlunoLogado(){
		try{
			return (Aluno)RequestContextHolder.getRequestAttributes().getAttribute("usuario", RequestAttributes.SCOPE_SESSION);
		}catch(Exception ex){
			return null;
		}
	}
	
	
}
