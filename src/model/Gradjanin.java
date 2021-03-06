package model;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gradjanin")
//provera
//asd
public class Gradjanin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GRADJANINID", unique = true)
	private Integer id;
	
	@Column(name = "IME", unique = false)
	private String ime;
	
	@Column(name = "PREZIME", unique = false)
	private String prezime;

	@Column(name = "BROJLICNEKARTE", unique = false)
	private Integer brojlicne;
	
	@Column(name = "DATUMRODJENJA", unique = false)
	private Date datumrodjenja;
	
	@Column(name = "POL", unique = false)
	private String pol;
	
	@Column(name = "JMBG", unique = false)
	private Integer JMBG;
	
	@Column(name = "MESTORODJENJA", unique = false)
	private String mestoRodjenja;
	
	@Column(name = "OPSTINARODJENJA", unique = false)
	private String opstinaRodjenja;
	
	@Column(name = "DRZAVA", unique = false)
	private String drzava;
	
	@Column(name = "BROJTELEFONA", unique = false)
	private Integer brojTelefona;
	
	@Column(name = "EMAIL", unique = false)
	private String email;

	public Gradjanin(Integer id, String ime, String prezime, Integer brojlicne, Date datumrodjenja, String pol,
			Integer jMBG, String mestoRodjenja, String opstinaRodjenja, String drzava, Integer brojTelefona,
			String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.brojlicne = brojlicne;
		this.datumrodjenja = datumrodjenja;
		this.pol = pol;
		JMBG = jMBG;
		this.mestoRodjenja = mestoRodjenja;
		this.opstinaRodjenja = opstinaRodjenja;
		this.drzava = drzava;
		this.brojTelefona = brojTelefona;
		this.email = email;
	}

	public Gradjanin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Integer getBrojlicne() {
		return brojlicne;
	}

	public void setBrojlicne(Integer brojlicne) {
		this.brojlicne = brojlicne;
	}

	public Date getDatumrodjenja() {
		return datumrodjenja;
	}

	public void setDatumrodjenja(Date datumrodjenja) {
		this.datumrodjenja = datumrodjenja;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Integer getJMBG() {
		return JMBG;
	}

	public void setJMBG(Integer jMBG) {
		JMBG = jMBG;
	}

	public String getMestoRodjenja() {
		return mestoRodjenja;
	}

	public void setMestoRodjenja(String mestoRodjenja) {
		this.mestoRodjenja = mestoRodjenja;
	}

	public String getOpstinaRodjenja() {
		return opstinaRodjenja;
	}

	public void setOpstinaRodjenja(String opstinaRodjenja) {
		this.opstinaRodjenja = opstinaRodjenja;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public Integer getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(Integer brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
}