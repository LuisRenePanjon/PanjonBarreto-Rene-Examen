package ec.ups.edu.jpa;

import ec.ups.edu.bean.Libro;
import ec.ups.edu.dao.LibroDAO;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
