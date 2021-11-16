package afpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Exercices {

	public static void main(String[] args) {
		System.out.println("============EXECICICE 1==============");
		// VERSION JAVASCRIPT
		/*
		 * if ((year % 4 === 0 && year % 100 > 0) || (year % 400 === 0)) { alert(year +
		 * " est bissextile"); } else { alert(year + " n'est pas bissextile"); }
		 */

		// VERSION JAVA
		int year = 2016;
		if ((year % 4 == 0 && year % 100 > 0) || (year % 400 == 0)) {
			System.out.println(year + " est bissextile");

		} else {
			System.out.println(year + " n'est pas bissextile");
		}

		System.out.println("============EXECICICE 2==============");
		// JAVASCRIPT
		// methode moussa------------------------------
		/*
		 * var number = prompt('Entrez un chiffre'); console.log(number); var estPremier
		 * = true; for (i = 2; i < number; i++) { if (number % i == 0) {
		 * console.log(number + "est pas premier car il divisible par " + i); estPremier
		 * = false; break; } if (i == number) { console.log(number + " est premier");
		 * break; } }
		 */

		// VERSION JAVA
		int number = 5;
		boolean estPremier = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("dans if");
				System.out.println(number + "est pas premier car il divisible par " + i);
				estPremier = false;
				break;
			}
		}

		if (estPremier) {
			System.out.println(number + " est premier");
		}

		System.out.println("============EXECICICE 3==============");
		// VERSION JAVASCRIPT
		// 3. ajoute rune valeur fin tableau
		// var semaine = ['lundi', 'mar', 'mercredi', 'jeudi', 'vendredi', 'samedi',
		// 'dimanc'];
		// semaine.push("dimanche");
		// console.log(semaine);

		// 4. remplacer mar par mardi
		/*
		 * console.log("remplacer mar par mardi"); semaine[1] = "mardi";
		 * console.log(semaine);
		 */

		// autre methode indexOf() renvoie le 1er indice ou se trouve l'élément, si
		// l'élément n'est pas prenet retourne -1
		// console.log(semaine[semaine.indexOf("mar")] = "mardi");
		// console.log(semaine);

		// 5. afficher nb valeur d'un tableau

		// console.log(semaine.length);

		// 6. afficher 5eme valeur

		// console.log(semaine[4]);
		
		
		ArrayList<String> semaine = new ArrayList<>(Arrays.asList("Lundi","Mar","Mercredi","Jeudi","Vendredi","Samedi","Dimanc"));
		//semaine.add("Lundi");
		System.out.println(semaine.size());
		System.out.println(semaine.remove(semaine.size()-1));
		System.out.println(semaine);
		semaine.add("Dimanche");
		System.out.println(semaine.indexOf("Mar"));
		
		semaine.set(semaine.indexOf("Mar"), "Mardi");
		System.out.println(semaine);
		
		System.out.println(semaine.size());
		
		System.out.println(semaine.get(4));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
