package parcAutomobiles;

public abstract class TransporteurDeCharge extends Vehicule {
	protected static double chargeMax ; 
	protected double charge ; 
	
	public TransporteurDeCharge(String immatriculation) {
		super(immatriculation ); 
		this.charge=0; 
	
	}
	
	
	//Constructeur a partir de immatriculation et chargeMax
	public TransporteurDeCharge(String immatriculation,int chargeMax) {
		super(immatriculation ); 
		TransporteurDeCharge.chargeMax=chargeMax;
		this.charge=0; 
	}


	public double getChargeMax() {
    	return TransporteurDeCharge.chargeMax;
    }
	
    public double getCharge() {
    	return this.charge;
    }
    
    public void setChargeMax(double chargeMax) {
    	TransporteurDeCharge.chargeMax=chargeMax;
    }
	
    public void setCharge(double charge) {
    	this.charge=charge;
    }
	
	
	protected void charger(int poids) {
			if (this.getCharge()+poids<this.getChargeMax()) {
				this.setCharge(this.getCharge()+poids) ; 
			}
		}
		
	}

