package data_structures;

public class Palindromes {
	public boolean isPalindrome(String word) {
		
		for (int i = 0; i < word.length(); i++) {
			char last = word.charAt(word.length()-1-i); 
			char first = word.charAt(i);
			char last2 = Character.toLowerCase(last);
			char first2 = Character.toLowerCase(first);
			if (last2 != first2 ) {
				return false;
			} 
		}
		return true;
	}
	
}
