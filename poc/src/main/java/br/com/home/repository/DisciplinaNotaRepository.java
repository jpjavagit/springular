package br.com.home.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.entity.Aluno;
import br.com.home.entity.Disciplina;
import br.com.home.entity.DisciplinaNota;

@Repository
public class DisciplinaNotaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public List<DisciplinaNota> getDisciplinasENotas(Aluno aluno, Long disciplina){
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(DisciplinaNota.class);
		criteria.createAlias("this.aluno", "aluno");
		criteria.add(Restrictions.eq("aluno.email", aluno.getEmail()));
		criteria.add(Restrictions.eq("this.disciplina.codigoDisciplina", disciplina));
		return criteria.list();
	}

	@Transactional
	public List<Disciplina> getDisciplinas(){
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Disciplina.class);
		return criteria.list();
	}
}
