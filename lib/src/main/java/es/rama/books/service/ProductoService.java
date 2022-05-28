package es.rama.books.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import es.rama.books.entity.Producto;

public interface ProductoService extends BaseService<Producto,Long>{

	List<Producto> search (String filtro);
	Page<Producto> search (String filtro,Pageable pageable);
	
}
