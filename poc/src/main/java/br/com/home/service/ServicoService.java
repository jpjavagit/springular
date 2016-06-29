package br.com.home.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.home.entity.SolicitarServico;
import br.com.home.repository.ServicoRepository;

@Service
public class ServicoService implements Serializable{

	private static final long serialVersionUID = -6350341602949127578L;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public List<SolicitarServico> getServicos(){
		return servicoRepository.getServicos();
	
	}
	
}
