package tn.edu.espritCs.info1.watcher.business.impl;

import javax.ejb.Stateless;
import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessLocal;
import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote;

/**
 * Session Bean implementation class IncidentBusiness
 */
@Stateless
public class IncidentBusiness implements IncidentBusinessRemote, IncidentBusinessLocal {

    /**
     * Default constructor. 
     */
    public IncidentBusiness() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void doAutograph() {
		System.out.println("ya hala chou lounak ...");
		
	}

}
