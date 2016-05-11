package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import session.GradjaninDaoLocal;


public class ReadGradjaninController extends HttpServlet{

	@EJB
	GradjaninDaoLocal gradjaninDao;
	
	private static Logger log = Logger.getLogger(ReadGradjaninController.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			

			request.setAttribute("gradjanin", gradjaninDao.findAll());
			
			getServletContext().getRequestDispatcher("/gradjaninRead.jsp").forward(request, response);
		
		} catch (ServletException e) {
			log.error(e);
			throw e;
		} catch (IOException e) {
			log.error(e);
			throw e;
		}		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
	
}
