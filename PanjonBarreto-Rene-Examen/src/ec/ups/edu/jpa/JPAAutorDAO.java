package ec.ups.edu.jpa;

import ec.ups.edu.bean.Autor;
import ec.ups.edu.dao.AutorDAO;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO {

	public JPAAutorDAO() {
		super(Autor.class);
	}
	
	
	
	
}
