package es.rama.books.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import es.rama.books.entity.Producto;
import es.rama.books.repository.BaseRepository;
import es.rama.books.repository.ProductoRepository;
@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {


@Autowired
ProductoRepository productoRepository;

public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
	super(baseRepository);
	// TODO Auto-generated constructor stub


}



}
