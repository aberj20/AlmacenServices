package es.rama.books.repository;


import org.springframework.stereotype.Repository;

import es.rama.books.entity.Producto;

@Repository
public interface ProductoRepository  extends BaseRepository<Producto,Long>{

}
