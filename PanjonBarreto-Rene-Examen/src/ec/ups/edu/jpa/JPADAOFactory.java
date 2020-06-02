package ec.ups.edu.jpa;

import ec.ups.edu.dao.AutorDAO;
import ec.ups.edu.dao.CapitulosDAO;
import ec.ups.edu.dao.DAOFactory;
import ec.ups.edu.dao.LibroDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}

	@Override
	public CapitulosDAO getCapitulosDAO() {
		// TODO Auto-generated method stub
		return new JPACapitulosDAO();
	}

	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

	
	
}
