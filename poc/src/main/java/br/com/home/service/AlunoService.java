package br.com.home.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.home.entity.Aluno;
import br.com.home.repository.AlunoRepository;
import br.com.home.repository.PocRepository;

@Service
public class AlunoService implements Serializable{

	private static final long serialVersionUID = -6350341602949127578L;
	
	@Autowired
	private PocRepository repository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	/**
	 * Salva o aluno 
	 * @author jpjava
	 * @param aluno:Aluno
	 */
	public void salvarAluno(Aluno aluno){
		repository.save(aluno);
	}
	
	/**
	 * Verifica se o aluno existe para logar
	 * @param aluno:Aluno
	 * @return boolean
	 */
	public boolean existeAluno(Aluno aluno){
		return (alunoRepository.recuperaAlunoByEmail(aluno) != null ?true: false);
	}
	
	public List<Aluno> getAlunos(){
		return alunoRepository.getAlunos();
	}
	
	public Aluno getAlunoPorEmail(Aluno aluno){
		return alunoRepository.recuperaAlunoByEmail(aluno);
	}
	
}
