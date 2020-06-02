package ec.ups.edu.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulos
 *
 */
@Entity

public class Capitulos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;
	
	private int numero;
	
	private String titulo;
	
	@ManyToOne
	@JoinColumn
	private Libro libro;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "capitulos")
	private Autor autor;
	
	
	public Capitulos(int numero, String titulo) {
		super();
		this.numero = numero;
		this.titulo = titulo;
	}

	public Capitulos(int codigo, int numero, String titulo, Libro libro) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
		this.libro = libro;
	}

	public Capitulos() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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
		Capitulos other = (Capitulos) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Capitulos [codigo=" + codigo + ", numero=" + numero + ", titulo=" + titulo + ", libro=" + libro
				+ ", autor=" + autor + "]";
	}
   
	
}
