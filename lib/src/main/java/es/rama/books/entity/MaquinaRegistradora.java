package es.rama.books.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="maquinas_registradoras")

public class MaquinaRegistradora extends Base{
	@Column(name="piso")
private Long piso;

	
	
	public MaquinaRegistradora(Long id,Long piso) {
		super(id);
		this.piso = piso;
	}
	

	public MaquinaRegistradora() {
		super();
	}


	public Long getPiso() {
		return piso;
	}

	public void setPiso(Long piso) {
		this.piso = piso;
	}
	
}
