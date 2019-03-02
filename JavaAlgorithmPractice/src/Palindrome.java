
public class Palindrome {

	public Palindrome(){
		
	}
	
	public static boolean palindrome(String inputString){
		
		int startIncrement = 0;
		int endIncrement = inputString.length()-1;
		
		while(startIncrement < endIncrement){
			if(inputString.charAt(startIncrement)!= inputString.charAt(endIncrement-startIncrement)){
				return false;
			}
			startIncrement++;
		}
		
		
		return true;
	}
	
	public static void testPalindrome(){
		
		System.out.println("Palindrome dad test:\rExpected = True");
		System.out.println("Actual = "+ Palindrome.palindrome("dad"));
		System.out.println("Palindrome  tteeeeett test:\rExpected = True");
		System.out.println("Actual = "+ Palindrome.palindrome("tteeeett"));
		System.out.println("Palindrome  test test:\rExpected = False");
		System.out.println("Actual = "+ Palindrome.palindrome("test"));
	}
}
