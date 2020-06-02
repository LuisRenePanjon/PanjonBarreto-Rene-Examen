package ec.ups.edu.jpa;

import ec.ups.edu.bean.Capitulos;
import ec.ups.edu.dao.CapitulosDAO;

public class JPACapitulosDAO extends JPAGenericDAO<Capitulos, Integer> implements CapitulosDAO{
	
	public JPACapitulosDAO() {
		super(Capitulos.class);
	}

}
