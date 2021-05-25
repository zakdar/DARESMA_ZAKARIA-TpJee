package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EtudiantDao;
import entities.Etudiants;

/**
 * Servlet implementation class inscription
 */
@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inscription() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      String username = request.getParameter("username");
	      String pass = request.getParameter("pass");
	      String nom = request.getParameter("nom");
	      String prenom = request.getParameter("prenom");
	     
	      Etudiants et=new Etudiants();
	      et.setEmail(username);
	      et.setNom(nom);
	      et.setPassword(pass);
	      et.setPrenom(prenom);
	      EtudiantDao.AjouterEtudiant(et);
	      response.sendRedirect("Authentification");
	     
	}

}
