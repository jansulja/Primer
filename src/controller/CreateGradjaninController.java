package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gradjanin;
import session.GradjaninDaoBean;

/**
 * Servlet implementation class CreateGradjaninController
 */
@WebServlet("/CreateGradjaninController")
public class CreateGradjaninController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@EJB
	GradjaninDaoBean gradjaninDao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateGradjaninController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			String ime = null;
			String prezime = null;
			Integer brojlicne = null;
			Date datumrodjenja = null;
			String pol = null;
			Integer JMBG = null;
			String mestoRodjenja = null;
			String opstinaRodjenja = null;
			String drzava = null;
			Integer brojTelefona = null;
			String email = null;
			
			 
			
			if ((request.getParameter("ime") != null) && (!"".equals(request.getParameter("ime")))) {
				ime = request.getParameter("ime");
			}

			if ((request.getParameter("prezime") != null) && (!"".equals(request.getParameter("prezime")))) {
				prezime = request.getParameter("prezime");
			}
			
			if ((request.getParameter("brojlicne") != null)) {
				brojlicne = new Integer(request.getParameter("brojlicne"));
			}
			
			if ((request.getParameter("datumrodjenja") != null) && (!"".equals(request.getParameter("datumrodjenja")))) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					datumrodjenja = sdf.parse(request.getParameter("datumrodjenja"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if ((request.getParameter("pol") != null) && (!"".equals(request.getParameter("pol")))) {
				pol = request.getParameter("pol");
			}
			
			if ((request.getParameter("JMBG") != null) && (!"".equals(request.getParameter("JMBG")))) {
				JMBG = new Integer(request.getParameter("JMBG"));
			}
			
			if ((request.getParameter("mestoRodjenja") != null) && (!"".equals(request.getParameter("mestoRodjenja")))) {
				mestoRodjenja = request.getParameter("mestoRodjenja");
			}
			
			if ((request.getParameter("opstinaRodjenja") != null) && (!"".equals(request.getParameter("opstinaRodjenja")))) {
				opstinaRodjenja = request.getParameter("opstinaRodjenja");
			}
			
			if ((request.getParameter("drzava") != null) && (!"".equals(request.getParameter("drzava")))) {
				drzava = request.getParameter("drzava");
			}
			
			if ((request.getParameter("brojTelefona") != null) && (!"".equals(request.getParameter("brojTelefona")))) {
				brojTelefona = new Integer( request.getParameter("brojTelefona"));
			}
			
			if ((request.getParameter("email") != null) && (!"".equals(request.getParameter("email")))) {
				email = request.getParameter("email");
			}
			
			Gradjanin gradjanin = new Gradjanin();
			
			if (ime != null)
				gradjanin.setIme(ime);
			
			if (prezime != null)
				gradjanin.setPrezime(prezime);
			
			if (brojlicne != null)
				gradjanin.setBrojlicne(brojlicne);
			
			if (datumrodjenja != null)
				gradjanin.setDatumrodjenja(datumrodjenja);
			
			if (pol != null)
				gradjanin.setPol(pol);
			
			if (JMBG != null)
				gradjanin.setJMBG(JMBG);
			
			if (mestoRodjenja != null)
				gradjanin.setMestoRodjenja(mestoRodjenja);
			
			if (opstinaRodjenja != null)
				gradjanin.setOpstinaRodjenja(opstinaRodjenja);
			
			if (drzava != null)
				gradjanin.setDrzava(drzava);
			
			if (brojTelefona != null)
				gradjanin.setBrojTelefona(brojTelefona);
			
			if (email != null)
				gradjanin.setEmail(email);
			
		gradjaninDao.persist(gradjanin);
		getServletContext().getRequestDispatcher("/gradjaninRead.jsp").forward(request, response);
		return;
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
