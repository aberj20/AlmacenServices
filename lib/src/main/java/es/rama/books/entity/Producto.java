package es.rama.books.entity;
import javax.persistence.*;



@Entity
@Table(name="productos")
public class Producto extends Base{
//@Id
///@GeneratedValue(strategy = GenerationType.IDENTITY) SOLO SI ESTA COM AUTOINCREMENTAL EN LA BD
//private Long id;
@Column(name = "Nombre")
private String nombre;
@Column(name = "Precio")
private double precio;



public Producto(Long id,String nombre, double precio) {
	super(id);
	this.nombre = nombre;
	this.precio = precio;
}


public Producto() {
	super();
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}


}
