package afpa;

public class Personne {
	//Les attributs
	private String nom;
	private String prenom;
	
	private String email;
	
	public Personne() {
		this.nom ="Camara - TEST";
		this.prenom ="Moussa";

	}


	public Personne(String nomT, String prenomT) {
		super();
		nom = nomT;
		prenom = prenomT;
	}
	
	public Personne(String nom) {
		super();
		this.nom = nom;
	}


	//Les méthodes
	public void manger() {
		System.out.println("Je mange du chocolat");
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String testNom) {
		nom = testNom;
	}

	//Les accesseurs
	public String getPrenom() {
		return prenom;
	}

	//Les mutateurs
	public void setPrenom(String test) {
		this.prenom = test;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}


