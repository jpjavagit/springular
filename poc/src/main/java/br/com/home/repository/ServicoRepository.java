package br.com.home.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.entity.Servico;
import br.com.home.entity.SolicitarServico;

@Repository
public class ServicoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<SolicitarServico> getServicos(){
		Session session = (Session)entityManager.getDelegate();
		Criteria criteria = session.createCriteria(Servico.class);
		return criteria.list();
	}
	

	
}
