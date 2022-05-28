package es.rama.books.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "cajeros")

public class Cajero extends Base {
	
	
@Column(name="nomapels")
	private String nombre;

@JsonIgnore
@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajero")
List<Venta> ventas = new ArrayList<Venta>();

public Cajero(Long id,String nombre) {
	//super(id);
	this.nombre = nombre;
}

public Cajero() {
	super();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public List<Venta> getVentas() {
	return ventas;
}

public void setVentas(List<Venta> ventas) {
	this.ventas = ventas;
}


}
