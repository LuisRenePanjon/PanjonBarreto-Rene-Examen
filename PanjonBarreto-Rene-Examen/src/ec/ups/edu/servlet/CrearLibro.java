package ec.ups.edu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		Autor autor = autorDAO.read(Integer.parseInt(codigoautor));
		
		
		
		
		
		
		
		
	}

}
