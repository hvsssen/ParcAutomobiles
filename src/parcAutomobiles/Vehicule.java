package parcAutomobiles;

public abstract class Vehicule {
	protected String immatriculation ; 
	protected static int poidsAvide ; 
	protected double vitesseMax ; 
	
	
	//Constructeur par immatriculation 
	public Vehicule(String immatriculation ) {
		this.immatriculation=immatriculation ;
	}
	
	// Construction par immatriculation et poidsAvide
	public Vehicule(String immatriculation , int poidsAvide) {
		this.immatriculation=immatriculation ; 
		Vehicule.poidsAvide=poidsAvide ;
	}
	
	public String getImmatriculation() {
	        return immatriculation;
	    }

	public static int getPoidsAVide() {
	        return poidsAvide;
	    }

    public double getVitesseMax() {
	        return vitesseMax;
	    }

	   
	public void setImmatriculation(String immatriculation) {
	        this.immatriculation = immatriculation;
	    }

	public static void setPoidsAVide(int poids) {
	        poidsAvide = poids;
	    }

	public void setVitesseMax(double vitesseMax) {
	        this.vitesseMax = vitesseMax;
	    }
	protected abstract int calculerVitesseMaximale(); 
	}

			
		
