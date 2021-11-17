package afpa;

import java.util.Scanner;

public class MainLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5.    Écrire un programme de test de la classe livre
		 *  qui demande à l’utilisateur le nombre de livre à créer. Pour chaque livre, le programme demande le titre, l’auteur et le prix.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nbre de livre");
		int nbreLivre = sc.nextInt();
		System.out.println("Vous avez saisi " +nbreLivre);
		
		Livre [] livres = new Livre[nbreLivre];
		for (int i = 0; i < livres.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Entrez le titre du livre" +(i+1));
			String titre = sc.nextLine();
			
			System.out.println("Entrez l'auteur du livre" +(i+1));
			String auteur = sc.nextLine();
			
			System.out.println("Entrez le prix du livre" +(i+1));
			int prix = sc.nextInt();
			
			livres[i] = new Livre(titre,auteur,prix);
		}
		//6.    Afficher la liste des livres
		
		//7.    Le programme doit aussi afficher le nombre de 
		//livre ainsi que le prix total des livres
		int total = 0;
		for (Livre machin : livres) {
			System.out.println(machin);
			System.out.println(machin.getPrix());
			total +=  machin.getPrix();
		}
		System.out.println("Le prix total :" + total);
	}

}
