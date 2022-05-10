package es.rama.books.service;

import java.io.Serializable;
import java.util.List;

import es.rama.books.entity.Base;

public interface BaseService<E extends Base,ID extends Serializable> {
public List<E> findAll() throws Exception;
public E findById(ID id) throws Exception;
public E save(E entidad) throws Exception;
public E update(ID id, E entidad)throws Exception;
public boolean delete(ID id)throws Exception;
}
