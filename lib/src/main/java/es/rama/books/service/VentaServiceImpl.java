package es.rama.books.service;

import org.springframework.stereotype.Service;

import es.rama.books.entity.Venta;
import es.rama.books.repository.BaseRepository;
@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta,Long> implements VentaService{

	public VentaServiceImpl(BaseRepository<Venta, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
