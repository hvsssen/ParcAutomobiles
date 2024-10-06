package parcAutomobiles;

public class camionBache extends TransporteurDeCharge {

	//Constructeur a partir de immatriculation 
	
	public camionBache(String immatriculation ) {
		super(immatriculation);
		camionBache.poidsAvide=4;
		camionBache.chargeMax =20;
	}
	
	//Override
	protected int calculerVitesseMaximale() {
			if (this.charge <3) {
				return 110 ; 
			}
			else {
				return 80 ; 
			}
	}
	
}
	
