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
	
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cajero")
	private Cajero cajero;
	
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="maquina")
	private MaquinaRegistradora maquina;
	
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto producto;

	@Column(name="fecha_venta")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fecha;
	




	public Venta(Long id, Cajero cajero, MaquinaRegistradora maquina, Producto producto, Calendar fecha) {
		super(id);
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
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
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}


	public MaquinaRegistradora getMaquina() {
		return maquina;
	}


	public void setMaquina(MaquinaRegistradora maquina) {
		this.maquina = maquina;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
