package location.domain;

public class Voiture {
	
	String immatriculation;
	int nbPorte;
	
	public Voiture(String immatriculation, int nbPorte) {
		super();
		this.immatriculation = immatriculation;
		this.nbPorte = nbPorte;
	}

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getNbPorte() {
		return nbPorte;
	}

	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}
	
	

}
