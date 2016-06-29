package br.com.home.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.home.entity.Aluno;
import br.com.home.service.AlunoService;

/**
 * Classe Interceptora após Login
 * @author jpjava
 */
public class InterceptorAuth extends HandlerInterceptorAdapter{
	
	@Autowired
	AlunoService alunoService; 
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		Aluno usuarioLogado = new Aluno();
		usuarioLogado = (Aluno)session.getAttribute("usuario");
		
		if(usuarioLogado == null){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			if(!"anonymousUser".equals(auth.getPrincipal())){
				String login = auth.getName();
				usuarioLogado = new Aluno();
				usuarioLogado.setEmail(login);
				usuarioLogado = alunoService.getAlunoPorEmail(usuarioLogado);
				session.setAttribute("usuario", usuarioLogado);
			}
		}
		return super.preHandle(request, response, handler);
	}

}
