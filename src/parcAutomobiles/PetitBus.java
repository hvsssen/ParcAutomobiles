package parcAutomobiles;

public class PetitBus extends TransporteurParPlace implements VehiculeLouable {
	
	public PetitBus(String immatriculation,int nbrDePlaces) {
		super(immatriculation, nbrDePlaces ); 
		PetitBus.poidsAvide=4;
		this.vitesseMax=150;
	}
	
	public int getNbrDePlaces() {
    	return this.nbrDePlaces;
    }

	
	public int calculerVitesseMaximale() {
		return 150 ; 
	}
	public double facturer(int d) {
		double coeff=d/this.calculerVitesseMaximale() ;
		return coeff * prixAFacturer ; 
	}
	
	

}
