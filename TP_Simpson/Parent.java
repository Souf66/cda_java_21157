package TP_Simpson;

public class Parent extends GrandParent {
	
	private String nom = "Simpson";
	private String prenom = "Homer";

	public String pere()
	{
		return this.prenom +" "+this.nom;
	}

	public String mere()
	{
		return "Marge Simpson";
	}
}
