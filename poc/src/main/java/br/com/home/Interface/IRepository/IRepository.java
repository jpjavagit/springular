package br.com.home.Interface.IRepository;

import java.util.List;


/**
 * Interface que define operações do DAO
 * @author jpjava
 *
 * @param <T>
 */
public interface IRepository<T> {
	
	public void save(Object obj);
	
	public T getUniqueObject(Object obj);
	
	public void update(Object obj);
	
	public List<T> getListObject(Object obj);
	
	public T getObjectById(Class<T> clazz, Long id);
	
}
