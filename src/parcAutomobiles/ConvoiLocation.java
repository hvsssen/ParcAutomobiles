package parcAutomobiles;

import java.util.List;
import java.util.ArrayList;

public class ConvoiLocation {
	public List<VehiculeLouable> lesVehiculesLoues ; 
	
	public ConvoiLocation () {
		this.lesVehiculesLoues = new ArrayList<>() ; 
	}
	
	
	public List<VehiculeLouable> getVehiculesLoues(){
		return this.lesVehiculesLoues;
	}
	
	
	public void ajouterVehiculeLoue(VehiculeLouable vehiculeLouable) {
		this.lesVehiculesLoues.add(vehiculeLouable); 
	}
	
	public void supprimerVehiculeLoue(VehiculeLouable vehiculeLouable) {
		this.lesVehiculesLoues.remove(vehiculeLouable); 
	}
	
	public double calculerCoutLocation (int distance ) {
		double coutTotalDeLocation =0  ;
		for (int i=0;i<this.lesVehiculesLoues.size();i++) {
			coutTotalDeLocation+=lesVehiculesLoues.get(i).facturer(distance);
			 
		}
		return coutTotalDeLocation ;
	}
	
	public boolean estLoue(Vehicule vehicule) {
		for(VehiculeLouable element : lesVehiculesLoues) {
			if(element.equals(vehicule)) {
				return true ;
			}
		}
		return false ;
	}
	
	public VehiculeLouable getVehiculePlusLent() {
		double vitesseMin=100000;
		int indexVehiculeLent=0;
		for (int i=0;i<this.lesVehiculesLoues.size();i++) {
			if (((Vehicule)lesVehiculesLoues.get(i)).calculerVitesseMaximale()<vitesseMin) {
				vitesseMin=((Vehicule)lesVehiculesLoues.get(i)).calculerVitesseMaximale();
				indexVehiculeLent=i;
				
				
			}
		}
		return lesVehiculesLoues.get(indexVehiculeLent) ; 
	}

}
