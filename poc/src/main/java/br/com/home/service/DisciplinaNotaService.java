package br.com.home.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.home.entity.Aluno;
import br.com.home.entity.Disciplina;
import br.com.home.entity.DisciplinaNota;
import br.com.home.repository.AlunoRepository;
import br.com.home.repository.DisciplinaNotaRepository;
import br.com.home.repository.PocRepository;

@Service
public class DisciplinaNotaService implements Serializable{

	private static final long serialVersionUID = -6350341602949127578L;
	
	@Autowired
	private PocRepository repository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private DisciplinaNotaRepository disciplinaNotaRepository;
	
	
	public List<DisciplinaNota> getDisciplinasNota(Aluno aluno, Long disciplina){
		return disciplinaNotaRepository.getDisciplinasENotas(aluno, disciplina);
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinaNotaRepository.getDisciplinas();
	}
	
}
