package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	Stack<Character> brackets = new Stack<Character>();

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	public static void main(String[] args) {
		TestMatchingBrackets test = new TestMatchingBrackets();
	}

	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
		char c = b.charAt(i)	;		
		if (c=='{') {
			brackets.push(c);
			
		} else if(c=='}') {
			if (brackets.size()>0) {
				brackets.pop();	
			} else {
				return false;
			}
			
		}
		
		
	
	}
		if(brackets.size()>0) {
			return false;
	}
		
		return true;

}
}