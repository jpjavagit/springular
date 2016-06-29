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

@Repository
public class AlunoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Aluno recuperaAlunoByEmail(Aluno aluno) {
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(aluno.getClass());
		criteria.add(Restrictions.eq("email", aluno.getEmail()));
		return (Aluno)criteria.uniqueResult();
	}

	@Transactional
	public List<Aluno> getAlunos(){
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Aluno.class);
		return criteria.list();
	}
	

	
}
