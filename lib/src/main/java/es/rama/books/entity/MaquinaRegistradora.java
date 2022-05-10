package es.rama.books.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="maquinas_registradoras")

public class MaquinaRegistradora extends Base{
	@Column(name="piso")
private int piso;

	
	
	public MaquinaRegistradora(Long id,int piso) {
		super(id);
		this.piso = piso;
	}
	

	public MaquinaRegistradora() {
		super();
	}


	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
}
