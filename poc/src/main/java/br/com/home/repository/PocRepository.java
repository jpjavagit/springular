package br.com.home.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PocRepository {

	@PersistenceContext
	EntityManager entityManager; 
	
	@Transactional
	public void save(Object obj) {
		 entityManager.persist(obj);
	}
	
}
