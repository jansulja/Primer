package session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.Gradjanin;
import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session.GenericDaoBean;


@Stateless
@Local(GradjaninDaoLocal.class)
public class GradjaninDaoBean extends GenericDaoBean<Gradjanin, Integer>
		implements GradjaninDaoLocal {
	
	
	
}