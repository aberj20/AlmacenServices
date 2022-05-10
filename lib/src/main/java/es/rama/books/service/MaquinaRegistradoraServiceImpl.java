package es.rama.books.service;

import org.springframework.stereotype.Service;

import es.rama.books.entity.MaquinaRegistradora;
import es.rama.books.repository.BaseRepository;
@Service
public class MaquinaRegistradoraServiceImpl extends BaseServiceImpl<MaquinaRegistradora,Long>{

	public MaquinaRegistradoraServiceImpl(BaseRepository<MaquinaRegistradora, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

}
