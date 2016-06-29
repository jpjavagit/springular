package br.com.home.Interface.IService;

/**
 * Interface que define as operações do Service
 * @author jpjava
 */
import java.util.List;

public interface IService<T> {

	public void salvarObjeto(Object obj);
	
	public T recuperarObjetoUnico(Object obj);
	
	public void atualizarObjeto(Object obj);
	
	public List<T> recuperarLista(Object obj);
	
	public T recuperaObjetoPorId(Class<T> clazz, Long id);
	
	
}
