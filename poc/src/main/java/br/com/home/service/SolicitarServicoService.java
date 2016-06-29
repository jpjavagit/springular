package br.com.home.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.home.entity.SolicitarServico;
import br.com.home.repository.PocRepository;
import br.com.home.repository.SolicitarServicoRepository;

@Service
public class SolicitarServicoService implements Serializable{

	private static final long serialVersionUID = -6350341602949127578L;
	
	@Autowired
	private PocRepository repository;
	
	@Autowired
	private SolicitarServicoRepository solicitarRepository;
	

	/**
	 * Salva a solicitaão serviço 
	 * @author jpjava
	 * @param aluno:Aluno
	 */
	public void salvarSolicitacaoServico(SolicitarServico solicitacaoService){
		solicitacaoService.setDataSolicitacao(new Date());
		repository.save(solicitacaoService);
	}
	
	public List<SolicitarServico> getServicos(Long idAluno){
		return solicitarRepository.getServicos(idAluno);
	}

	
}
