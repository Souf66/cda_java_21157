package afpa;
public class Main {

	public static void main(String[] args) {
		// instanciation
		
		
		//cda.nom="Camara";
		//cda.setPrenom("Moussa");
				
		//System.out.println(cda.getNom());
		//cda.setNom("afpa");
		
		//System.out.println(cda.getNom());
		
		Personne cda2 = new Personne("21157","CDA");
		System.out.println(cda2.getNom()+ " " +cda2.getPrenom());
		//cda2.setNom("test");
		
		cda2.manger();
		
	}
}










