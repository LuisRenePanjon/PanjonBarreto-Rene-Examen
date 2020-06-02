package ec.ups.edu.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	private String nombre;
	
	
	private String isbn;
	
	private int numPaginas;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulos> listaCapitulos = new  HashSet<Capitulos>();
	
	
	public Libro(String nombre, String isbn, int numPaginas) {
		super();
		this.nombre = nombre;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
	}



	public Libro() {
		super();
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public int getNumPaginas() {
		return numPaginas;
	}



	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Set<Capitulos> getListaCapitulos() {
		return listaCapitulos;
	}



	public void setListaCapitulos(Set<Capitulos> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", isbn=" + isbn + ", numPaginas=" + numPaginas
				+ ", listaCapitulos=" + listaCapitulos + "]";
	}
	
	
   
}
