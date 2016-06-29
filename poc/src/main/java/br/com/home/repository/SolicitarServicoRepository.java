package br.com.home.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.entity.SolicitarServico;

@Repository
public class SolicitarServicoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<SolicitarServico> getServicos(Long idAluno){
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(SolicitarServico.class);
		criteria.add(Restrictions.eq("this.aluno.id", idAluno));
		return criteria.list();
	}
	

	
}
