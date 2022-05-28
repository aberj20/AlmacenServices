package es.rama.books.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.rama.books.entity.Producto;

@Repository
public interface ProductoRepository  extends BaseRepository<Producto,Long>{

	List<Producto> findByNombreContaining(String nombre);
	
	@Query(value="SELECT p FROM Producto p WHERE p.nombre LIKE %:filtro%")
	List<Producto> busquedaByNombre (@Param("filtro") String nombre);
	
	@Query(
			value="SELECT * FROM productos  WHERE nombre LIKE %:filtro%",
			nativeQuery = true
			)
	List<Producto> busquedaByNombreNativo (@Param("filtro") String nombre);
	
	
Page<Producto> findByNombreContaining(String nombre,Pageable pageable);
	


	@Query(value="SELECT p FROM Producto p WHERE p.nombre LIKE %:filtro%")
	Page<Producto> busquedaByNombre (@Param("filtro") String nombre,Pageable pageable);
	
	
	@Query(
			value="SELECT * FROM productos  WHERE nombre LIKE %:filtro% order by ?#{#pageable}",
			countQuery="SELECT COUNT(*) FROM productos",
			nativeQuery = true
			)
	Page<Producto> busquedaByNombreNativo (@Param("filtro") String nombre,Pageable pageable);
}
