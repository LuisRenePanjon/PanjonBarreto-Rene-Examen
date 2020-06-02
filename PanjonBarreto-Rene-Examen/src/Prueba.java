import ec.ups.edu.bean.Autor;
import ec.ups.edu.bean.Capitulos;
import ec.ups.edu.bean.Libro;
import ec.ups.edu.dao.AutorDAO;
import ec.ups.edu.dao.CapitulosDAO;
import ec.ups.edu.dao.DAOFactory;
import ec.ups.edu.dao.LibroDAO;

public class Prueba {

	
	public static void main(String[] args) {
	AutorDAO autorDAO = DAOFactory.getFactory().getAutorDAO();
	CapitulosDAO capitulosDAO = DAOFactory.getFactory().getCapitulosDAO();
	
	
	LibroDAO libroDAO = DAOFactory.getFactory().getLibroDAO();
	
	
	Libro libro = new Libro("Romeo y julieta","Rom-23432",567);
	
	
	//Capitulos capitulo = new Capitulos(2,"Romeo y Julieta se conocen");
	//capitulosDAO.create(capitulo);
	
	
	
	Capitulos capituloFin = new Capitulos(17,"Muere Romeo");
	Autor autor = new Autor(1,"William Sheakspear","Frances",capituloFin);
	
	
	
	capituloFin.setAutor(autor);
	capituloFin.setLibro(libro);
	

	libro.addCapitulo(capituloFin);
	
	libroDAO.create(libro);
	
	
	
	
	
	}

	
	
	
	
	
}
