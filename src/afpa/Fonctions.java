package afpa;

public class Fonctions {

	// Methode PRINCIPALE
	public static void main(String[] args) {
		System.out.println("La fonction CARRE " + carre(5));
		System.out.println(ma_fonction(65,5,15,25,30));
		System.out.println(ma_fonction(6,641));
		System.out.println(ma_fonction(105));
	}
	
	public static String ma_fonction(int ... values ) {
	    System.out.println( "1st value: " + values[0] );
	    return "Nb elements:"+values.length;
	}
	
	public static  int carre(int nbre){
		return nbre * nbre;
	}
	
	public static void carre1(String nbre){
		System.out.println(" Il est presque la" + nbre);
	}
}
