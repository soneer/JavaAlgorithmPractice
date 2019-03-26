/*
 * 
 * @author Soneer Sainion
 * 
 * Leetcode question: Valid-Parentheses
 * https://leetcode.com/problems/valid-parentheses
 *Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
 */

import java.util.HashMap;
import java.util.Stack;

public class LC_Valid_Parentheses {

	public LC_Valid_Parentheses() {
		// TODO Auto-generated constructor stub
		String example = "()";
		System.out.println("Is string("+example+") valid? "+ isValid(example));

		 example = "())";
		System.out.println("Is string("+example+") valid? "+ isValid(example));

		 example = "{()}";
		System.out.println("Is string("+example+") valid? "+ isValid(example));

		 example = "[][][][]";
		System.out.println("Is string("+example+") valid? "+ isValid(example));

		 example = "";
		System.out.println("Is string("+example+") valid? "+ isValid(example));
	}

	  public boolean isValid(String s) {
		  if(s.length()==0){
	            return true;
	        }
	        //Use a Stack Data Structure
	        Stack<Character> stackOfChar = new Stack<Character>();
	        HashMap<Character, Character> pairs = new HashMap<Character,Character>();
	        pairs.put(')', '(');
	        pairs.put(']','[');
	        pairs.put('}','{');
	        
	        //Loop through the characters of String 's'
	        for(int i = 0; i < s.length(); i++){
	            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
	            {
	                stackOfChar.push(s.charAt(i));
	            }
	            if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
	               if(stackOfChar.isEmpty() || pairs.get(s.charAt(i)) != stackOfChar.pop()){
	                   return false;
	               }
	            }
	            }
	     
	     return stackOfChar.isEmpty(); 
	    }
	  public static void main(String args[]) {
		  LC_Valid_Parentheses test = new LC_Valid_Parentheses();
	  }
}
