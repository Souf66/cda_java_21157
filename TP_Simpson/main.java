package TP_Simpson;

public class main {

	public static void main(String[] args) {
		Enfant enfant1 = new Enfant("Bart", "Simpson");
		
		System.out.println(enfant1+",ton p�re est " + enfant1.pere()+ " et ta m�re "+ enfant1.mere());
		
		//Ici, on purrait se dire comment peut on apeller la m�thode Grandpere() ?
		// Reponse: La classe enfant h�rite de la classe Parent qui h�rite de Grandpere
		//donc par consequent la classe enfant h�rite aussi de Grandpere
		
		System.out.println("Ah oui et ton grand p�re est " +enfant1.Grandpere());

	}

}
