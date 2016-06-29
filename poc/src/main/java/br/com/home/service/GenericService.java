package br.com.home.service;

import java.util.List;

import br.com.home.Interface.IService.IService;
import br.com.home.repository.GenericRepository;

/**
 * Classe genêrica - Service 
 * @author jpjava
 *
 * @param <T>
 */
public class GenericService<T> extends GenericRepository<T> implements IService<T>{

	public void salvarObjeto(Object obj) {
		super.save(obj);
	}

	public T recuperarObjetoUnico(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void atualizarObjeto(Object obj) {
		super.update(obj);
	}

	public List<T> recuperarLista(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public T recuperaObjetoPorId(Class<T> clazz, Long id) {
		return super.getObjectById(clazz, id);
	}

}
