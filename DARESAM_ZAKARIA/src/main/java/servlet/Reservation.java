package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.livresDao;
import entities.Etudiants;

/**
 * Servlet implementation class Reservation
 */
@WebServlet("/Reservation")
public class Reservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Reservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_livre = Integer.parseInt(request.getParameter("id_livre"));
		HttpSession session = request.getSession();
		Etudiants et = (Etudiants) session.getAttribute("etud");
		if (et != null) {
			livresDao.reservation(et.getId(), id_livre);
			response.sendRedirect("acceuil.jsp");
		} else {
              response.sendRedirect("Authentification");
		}
	}

}
