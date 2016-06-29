package br.com.home.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.home.Interface.IRepository.IRepository;

@Repository
public class GenericRepository<T> implements IRepository<T> {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void save(Object obj) {
		entityManager.persist(obj);	
	}

	public T getUniqueObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Object obj) {
		entityManager.merge(obj);
		
	}

	public List<T> getListObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public T getObjectById(Class<T> clazz, Long id) {
		return getEntityManager().find(clazz, id);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
