
public class StringSubString {

	public StringSubString() {
		// TODO Auto-generated constructor stub
	}

	public static void stringsInString(String text, String pattern){
		int index = text.indexOf(pattern);
		int count = 0;
		while (index != -1) {
		    count++;
		    text = text.substring(index + 1);
		    index = text.indexOf(pattern);
		}
		System.out.println("No of *is* in the input is : " + count);
	}
}
