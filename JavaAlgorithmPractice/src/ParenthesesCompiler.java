
public class ParenthesesCompiler {

	public ParenthesesCompiler() {
		// TODO Auto-generated constructor stub
	}

	public static boolean parenthesisCompiler(String inputString){
		int openParenthesisCount = 0;
		int closedParenthesisCount =  0;
		
		for(int i = 0; i < inputString.length(); i++){
			
			if(inputString.charAt(i)== '('){
				openParenthesisCount++;
			}
			else if(inputString.charAt(i)==')'){
				closedParenthesisCount++;
			}
			
			//Catch 
			if(closedParenthesisCount>openParenthesisCount){
				return false;
			}
		}
		
		if(closedParenthesisCount-openParenthesisCount !=0){
			return false;
		}
		return true;
	}
	
	public static void testParenthesisCompiler(){
		
		System.out.println("Parenthesis (()) test:\rExpected = True");
		System.out.println("Actual = "+ ParenthesesCompiler.parenthesisCompiler("(())"));
		
		System.out.println("Parenthesis ((((((()))))) test:\rExpected = False");
		System.out.println("Actual = "+ ParenthesesCompiler.parenthesisCompiler("((((((())))))"));
		
		System.out.println("Parenthesis (()))) test:\rExpected = F");
		System.out.println("Actual = "+ ParenthesesCompiler.parenthesisCompiler("(())))"));
	}
}
