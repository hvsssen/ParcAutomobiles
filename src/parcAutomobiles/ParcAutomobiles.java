package parcAutomobiles;

import java.util.ArrayList;
import java.util.List;

public class ParcAutomobiles {
	public String nom ; 
	public int capacity ; 
	public List<Vehicule> listDesVehicules ; 
	public ParcAutomobiles () {
		this.nom="";
		this.capacity=100 ;
		this.listDesVehicules=new ArrayList<>() ; 	
	}
	public ParcAutomobiles (String nom, int capacity) {
		this.nom=nom;
		this.capacity=capacity  ;
		this.listDesVehicules=new ArrayList<>() ; 	
	}
	
	public String getNom() {
		return this.nom ; 
	}
	
	public void  setNom(String nom) {
		 this.nom=nom ; 
	}
	public int getCapapcity() {
		return this.capacity ; 
	}
	
	public void  setCapacity(int capacity ) {
		 this.capacity=capacity ; 
	}
	
	public List<Vehicule> getListDesVehicules() {
		return this.listDesVehicules ; 
	}
	
	public void  ajouterVehicule (Vehicule vehicule) {
		if (this.listDesVehicules.size()< this.capacity){
			this.listDesVehicules.add(vehicule);
			}
	}
	public void supprimerVehicule (Vehicule vehicule) {
		this.listDesVehicules.remove(vehicule);
	}

}

