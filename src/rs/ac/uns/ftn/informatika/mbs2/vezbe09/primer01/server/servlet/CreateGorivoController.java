package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Gorivo;
import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session.GorivoDaoLocal;

public class CreateGorivoController extends HttpServlet {

	@EJB
	private GorivoDaoLocal gorivoDao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipGoriva = null;
		
		if ((request.getSession().getAttribute("admin")) == null) {
			response.sendRedirect(response.encodeURL("./login.jsp"));
			return;
		}
		
		
		if ((request.getParameter("tipGoriva") != null) && (!"".equals(request.getParameter("tipGoriva")))) {
			tipGoriva = request.getParameter("tipGoriva");
		}

		Gorivo gorivo = new Gorivo();
		if(tipGoriva != null)
			gorivo.setTipGoriva(tipGoriva);
		
		gorivoDao.persist(gorivo);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	
}
