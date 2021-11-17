package afpa;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		/*LES TYPES PRIMITIFS */
		 /*  int nombre1 = 50;
		 System.out.println(nombre1);
		 
		 String caractere = "C";
		 System.out.println(caractere);
		 char test = 'A';
		 System.out.println(test);
		 
		 /* TYPE REFERENCE*/
		 //Personne afpa = new Personne();
		 
		 /* LES CONSTANTES 
		 final int AFPA = 15;
		 System.out.println(AFPA);
		 
		 /* LES TABLEAUX
		 int [] machin = {1,2,3,4,5};
		 int bidule []= {1,2,3,4,5};
		 System.out.println("Le premier element de MACHIN:" +machin[0]);
		 System.out.println("Le premier element de BIDULE:" +bidule[2]);

		 String test1 []= {"Afpa", "Vanessa", "5"};
		 System.out.println(test1[1]);
		 System.out.println(test1[2]);
		 
		 System.out.println(test1.length);

		 /*for (int i = 0; i < test1.length; i++) {
			System.out.println(test1[i]);
		}*/
		 
		 /* BOUCLE FOREACH 
		 for (String machin2 : test1) {
			 
			 System.out.println(machin2);
		}
		 
		 for (int machin2 : machin) {
			 
			 System.out.println(machin2);
		}*/
		/*  LES COLLECTIONS */
		 ArrayList test = new ArrayList<>();
		 
		 test.add(6);
		 test.add("afpa");
		 
		 System.out.println(test);
		 
		 
		 ArrayList<String> coll = new ArrayList<>();
	        coll.add( "azerty" );
	        coll.add( "qwerty" );

	        // Combien y a t'il de données dans la collection ?
	        System.out.println( "Size == " + coll.size() );
	        coll.add( "MOUSSSA" );
	        System.out.println( "Size **** " + coll.size() );
	        System.out.println("Pour obtenir (sans le retirer) un"
	        		+ " élément situé à une position donnée.");
	        System.out.println(coll.get(0));
	        System.out.println(coll.get(2));

		 /* TABLEAUX 2 DIMENSIONS */
	        int[][] echiquier = {
        		{1,2,3,4},
        		{5,6,7,8}
	        };
    		//Boucles sur les deux tableaux
    		for(int  i = 0; i< echiquier.length; i++) {
    			System.out.println("eeee");
	    		for(int  j = 0; j< echiquier[i].length; j++) {
	    		System.out.println("\n echiquier : "+echiquier[i][j]);
	    		}
    		}

		 
		 
	}
}
