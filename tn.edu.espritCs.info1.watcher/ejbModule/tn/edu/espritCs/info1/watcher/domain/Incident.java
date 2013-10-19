package tn.edu.espritCs.info1.watcher.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Incident
 *
 */
@Entity

public class Incident implements Serializable {

	
	private int idIncident;
	private Date dateOfIncident;
	private String descIncident;
	private static final long serialVersionUID = 1L;

	public Incident() {
		super();
	}   
	@Id    
	public int getIdIncident() {
		return this.idIncident;
	}

	public void setIdIncident(int idIncident) {
		this.idIncident = idIncident;
	}   
	public Date getDateOfIncident() {
		return this.dateOfIncident;
	}

	public void setDateOfIncident(Date dateOfIncident) {
		this.dateOfIncident = dateOfIncident;
	}   
	public String getDescIncident() {
		return this.descIncident;
	}

	public void setDescIncident(String descIncident) {
		this.descIncident = descIncident;
	}
   
}
