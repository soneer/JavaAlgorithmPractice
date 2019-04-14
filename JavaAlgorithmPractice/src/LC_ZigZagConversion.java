
/*
 * Soneer Sainion
 * https://leetcode.com/problems/zigzag-conversion/
 * 
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 * 
 * 
 * 
 */
public class LC_ZigZagConversion {

	public LC_ZigZagConversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String args[]) {
		LC_ZigZagConversion.printResults("PAYPALISHIRING", 4);
	}

	public static void printResults(String s, int numRows) {
		System.out.println("Original String = "+s);
		System.out.println("Number Of Rows = "+ numRows);
		System.out.println("Converted String = "+convert(s,numRows));
		System.out.println("------------------------------------------------");
		System.out.println("");
	}

	public static String convert(String s, int numRows) {

		String modifed = "";
		String[] modifiedString = new String[numRows];

		//Variable to to see if we are desecending or ascending on the row
		int inc = -1; 
		int count = 0;

		//Special Cases Here:
		if(numRows == 1 ){
			return s;
		}

		for(int i = 0; i < s.length(); i++){
			//Initalize values of Array here so we do not end up with nulls
			if(modifiedString[count] == null){
				modifiedString[count] = "";
			}

			modifiedString[count] = modifiedString[count] + s.charAt(i);
			if(count >= numRows -1 || count <= 0){  
				inc = inc * -1;
			}  
			count = count + inc;    


		}
		for(int j = 0; j < modifiedString.length; j++){
			if( modifiedString[j] != null){
				modifed += modifiedString[j];
			}
		}

		return modifed;
	}

}
