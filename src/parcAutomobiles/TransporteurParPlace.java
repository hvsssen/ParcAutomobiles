package parcAutomobiles;

public abstract class TransporteurParPlace extends Vehicule {
		protected int nbrDePlaces ;
		
		
		//Constructeur par immatriculation 
		
		public TransporteurParPlace(String immatriculation) {
			super(immatriculation ); 
		}
		
		//Constructeur a partir de immatriculation et nbrDePlaces
		public TransporteurParPlace(String immatriculation,int nbrDePlaces) {
			super(immatriculation ); 
			this.nbrDePlaces=nbrDePlaces;
		}
		
		
		//Getters and Setters
		public int getNbrDePlaces() {
			return this.nbrDePlaces; 
		}	
		
		public void setNbrDePlaces(int nbrDePlaces) {
			this.nbrDePlaces=nbrDePlaces;  
		}
		
		protected abstract int calculerVitesseMaximale(); 


	
}
