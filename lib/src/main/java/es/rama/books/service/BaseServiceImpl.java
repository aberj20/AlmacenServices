package es.rama.books.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import es.rama.books.entity.Base;
import es.rama.books.entity.Producto;
import es.rama.books.repository.BaseRepository;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E,ID>{
	protected BaseRepository<E,ID> baseRepository;
	
	public BaseServiceImpl(BaseRepository<E,ID> baseRepository ) {
		this.baseRepository=baseRepository;
	}
	
	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			List<E> entidad = baseRepository.findAll();
		
			return entidad;
		}catch(Exception e) {
			
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			//Optional<Producto> producto= baseRepository.findOne(id);
			E entidad= baseRepository.findOne(id);
			return entidad;
		}catch(Exception e) {
			
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entidad) throws Exception {
		try {
			entidad= baseRepository.save(entidad);
			return entidad;
		}catch(Exception e) {
			
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E update(ID id, E entidad) throws Exception {
		try {
			E entidad2 = baseRepository.findOne(id);
		
		entidad2 = baseRepository.save(entidad);
			return entidad2;
		}catch(Exception e) {
			
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public boolean delete(ID id) throws Exception {
		try {
			if(baseRepository.exists(id)) {
				baseRepository.delete(id);
				return true;
			}else {
				throw new Exception();
			}
			}catch(Exception e) {
				
				throw new Exception(e.getMessage());
			}
	}

}
