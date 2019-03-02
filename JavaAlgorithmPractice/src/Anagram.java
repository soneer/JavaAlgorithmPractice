
public class Anagram {

	public Anagram() {
		// TODO Auto-generated constructor stub
	}

	public static boolean anagramCheck(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		b = b.toLowerCase();
		a = a.toLowerCase();
		for(int i = 0; i < a.length(); i++){
			if(b.contains(a.charAt(i)+"")){
				b = b.replaceFirst((a.charAt(i)+""), "=");
			}
			else
			{
				return false;
			}
		}
		b = b.replace("=", "");
		if(b.length()!=0){
			return false;
		}
		else{
		return true;
		}
	}
	
	public static void testAnagramCheck(String a, String b){
		
		System.out.println("Is '"+a+"' an Anagram of '"+b+"'?"+ anagramCheck(a, b));
	}
}
