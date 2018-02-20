package data_structures;

public class Palindromes {
	public boolean isPalindrome(String word) {
		String mergedWord = "";
		String noSC = "";
		String reverse = "";
		
		for (int i = 0; i < word.length(); i++) {
			noSC = noSC.toLowerCase();
			 if (word.charAt(i) != ',' && word.charAt(i) != ' ' && word.charAt(i) !=  '!' ) {
				noSC+=word.charAt(i);
			}

		}
		
		for (int i = noSC.length()-1; i >= 0; i--) {
			reverse += noSC.charAt(i);
			 char firstLetters= Character.toLowerCase(noSC.charAt(i));
			 char secondLetters= Character.toLowerCase(noSC.charAt(noSC.length()-1-i));
			
			if (firstLetters != secondLetters ) {
				return false;
			} 
		}
		System.out.println(noSC);
		return true;
	}
	
}
