
public class LongestSequence {

	public LongestSequence() {
		// TODO Auto-generated constructor stub
	}

	public static String longestSequence(String input){
		String longestSub = " ";
		String currentSub = " "; 
		for(int i = 0; i < input.length(); i++ ){
			if(currentSub == " "){
				currentSub = input.charAt(i)+"";
			}
			else{
			if(input.charAt(i)== currentSub.charAt(0)){
				currentSub += input.charAt(i);
			}
			else{
				currentSub = " ";
			}
			 if (longestSub.length() < currentSub.length()){
				longestSub = currentSub;
			}
			
			}
		}
		
		return longestSub;
	}
	
	public static void testLongestSequence(String str){
		System.out.println(longestSequence(str));
	}
}
