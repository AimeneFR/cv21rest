package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "CV")
@XmlAccessorType(XmlAccessType.NONE)
public class CV implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute
	private Integer id;
	
	@XmlElement
	private String nom;
	
	@XmlElement
	private String prenom;
	
	@XmlElement
	private String date;
	
	@XmlElement
	private String mel;
	
	public CV(String nom, String prenom, String date, String mel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.mel = mel;
	}
	public CV() {
	}
	
	@Override
	public String toString() {
		return ("CV [" + nom + " " + prenom
		
		+ ",Date=" + date + ",mel=" + mel + "]");
	}
}
