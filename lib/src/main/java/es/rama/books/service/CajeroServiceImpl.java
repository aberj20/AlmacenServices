package es.rama.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.rama.books.entity.Cajero;
import es.rama.books.repository.BaseRepository;
import es.rama.books.repository.CajeroRepository;
@Service
public class CajeroServiceImpl extends BaseServiceImpl<Cajero,Long> implements CajeroService{
	@Autowired
private CajeroRepository cajeroRepository;
	public CajeroServiceImpl(BaseRepository<Cajero, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
