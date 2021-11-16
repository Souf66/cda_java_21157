package afpa;

import java.util.Scanner;

public class Palindrome {
	public static String machin(String chaine) {
	String invertion ="";
	
	for (int i = 0; i < chaine.length(); i++) {
		invertion += chaine.charAt(chaine.length() - i - 1);
	}
	
		return invertion;
    }
}
