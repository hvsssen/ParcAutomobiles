package parcAutomobiles;

public class camionCiterne extends TransporteurDeCharge {
	
	//Constructeur a partir de immatriculation 
	
	public camionCiterne(String immatriculation ) {
		super(immatriculation ); 
		camionCiterne.poidsAvide=3;
		camionCiterne.chargeMax=10;
	}
	
	//Override
	protected int calculerVitesseMaximale() {
			if (this.charge<4) {
				return 120 ; 
			}
			else {
				return 90 ; 
			}
	}
	
} 







