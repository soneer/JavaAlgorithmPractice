/*
 * 
 * @author Soneer Sainion
 * 
 * Leetcode question: Valid-Parentheses
 * https://leetcode.com/problems/valid-parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
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
