package tn.edu.espritCs.info1.watcherWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessLocal;
import tn.edu.espritCs.info1.watcher.domain.Incident;

@ManagedBean(name = "incidentCtrBean")
@SessionScoped
public class IncidentCtr {
	private Incident incident = new Incident();
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
