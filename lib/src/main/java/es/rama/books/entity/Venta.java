package es.rama.books.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="venta")

public class Venta extends Base{
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cajero")
	private Cajero cajero;

	@Column(name="fecha_venta")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fecha;
	


	public Venta(Long id, Cajero cajero, Calendar fecha) {
		super(id);
		this.cajero = cajero;
		this.fecha = fecha;
	}


	public Venta() {
		super();
	}

	
	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Cajero getCajero() {
		System.out.print("ID cajero" +cajero.getId());
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}
	
	
}
