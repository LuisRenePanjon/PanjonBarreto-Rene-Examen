package ec.ups.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.bean.Autor;
import ec.ups.edu.bean.Capitulos;
import ec.ups.edu.bean.Libro;
import ec.ups.edu.dao.AutorDAO;
import ec.ups.edu.dao.CapitulosDAO;
import ec.ups.edu.dao.DAOFactory;
import ec.ups.edu.dao.LibroDAO;

/**
 * Servlet implementation class CrearLibro
 */
@WebServlet("/CrearLibro")
public class CrearLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombreLib, isbn , numpag, numcap, nombrecap, codigoautor;
		nombreLib = request.getParameter("nombrelib");
		isbn = request.getParameter("isbn");
		numpag = request.getParameter("numpag");
		numcap = request.getParameter("numcap");
		nombrecap = request.getParameter("nombrecap");
		codigoautor = request.getParameter("codigoautor");
		
		LibroDAO libroDAO = DAOFactory.getFactory().getLibroDAO();
		CapitulosDAO capitulosDAO = DAOFactory.getFactory().getCapitulosDAO();
		AutorDAO autorDAO = DAOFactory.getFactory().getAutorDAO();
		
		Libro libro = new Libro(nombreLib,isbn,Integer.parseInt(numpag));
		
		Autor autor = autorDAO.read(Integer.parseInt(codigoautor));
		
		Capitulos capitulos = new Capitulos(Integer.parseInt(numcap),nombrecap);
		
		
		
		
		autor.setCapitulos(capitulos);
		autorDAO.update(autor);
		
		capitulos.setAutor(autor);
		capitulos.setLibro(libro);
		
		libro.addCapitulo(capitulos);
		
		libroDAO.create(libro);
		
		response.sendRedirect("crearLibro.html");
		
		
		
		
		
		
	}

}
