package TP_Simpson;

public class main {

	public static void main(String[] args) {
		Enfant enfant1 = new Enfant("Bart", "Simpson");
		
		System.out.println(enfant1+",ton pére est " + enfant1.pere()+ " et ta mére "+ enfant1.mere());
		
		//Ici, on purrait se dire comment peut on apeller la méthode Grandpere() ?
		// Reponse: La classe enfant hérite de la classe Parent qui hérite de Grandpere
		//donc par consequent la classe enfant hérite aussi de Grandpere
		
		System.out.println("Ah oui et ton grand pére est " +enfant1.Grandpere());

	}

}
