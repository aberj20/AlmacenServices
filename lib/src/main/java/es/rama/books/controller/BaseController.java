package es.rama.books.controller;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import es.rama.books.entity.Base;


public interface BaseController<E extends Base,ID extends Serializable> {

	public ResponseEntity<?> getAll();
	public ResponseEntity<?> getAll(Pageable pageable);
	public ResponseEntity<?> getOne(@PathVariable ID id);
	public ResponseEntity<?> save(@RequestBody E entity);
	public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);
	public ResponseEntity<?>  delete(@PathVariable ID id);
	
	
	
}
