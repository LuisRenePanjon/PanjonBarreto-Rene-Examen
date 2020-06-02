package ec.ups.edu.dao;


import ec.ups.edu.jpa.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract AutorDAO getAutorDAO();
	public abstract CapitulosDAO getCapitulosDAO();
	public abstract LibroDAO getLibroDAO();
	
}
