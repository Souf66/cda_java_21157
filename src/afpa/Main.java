package afpa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Scanner entree = new  Scanner(System.in);
		System.out.println("Indiquez la chaîne de caractères");
		String chaine = entree.nextLine();

		String inserveChaine = Palindrome.machin(chaine);
	
		if (inserveChaine.equals(chaine))
			System.out.println(chaine + " est un palindrome");
		else
		System.out.println(chaine + " n'est pas un palindrome");*/
		
		Scanner scanner = new Scanner( System.in );
        System.out.println( "Veuillez saisir un palindrome : " );
        String str = (scanner.nextLine()).toLowerCase();
        if(str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println(str + " est un palindrome !");
        }
        else
            System.out.println(str + " n'est pas un palindrome !" );
	}
}








