package es.rama.books.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@MappedSuperclass

public class Base implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;

public Base(Long id) {
	super();
	this.id = id;
}


public Base() {
	super();
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

}
