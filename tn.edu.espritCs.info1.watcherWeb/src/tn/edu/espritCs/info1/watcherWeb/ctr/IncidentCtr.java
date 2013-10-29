package tn.edu.espritCs.info1.watcherWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessLocal;
import tn.edu.espritCs.info1.watcher.domain.Incident;

@ManagedBean
@SessionScoped
public class IncidentCtr {
	//creation of the model 
	private Incident incident=new Incident();
	
	//injection of the proxy 
	@EJB
	private IncidentBusinessLocal incidentBusinessLocal;
	
	public String doAddIncident(){
		incidentBusinessLocal.addIncident(incident);
		return "";
	}

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

}
