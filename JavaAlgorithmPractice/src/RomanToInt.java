import java.util.HashMap;

/**
 * @author Soneer Sainion
 * 
 * Leetcode question: Roman-to-Integer
 * https://leetcode.com/problems/roman-to-integer/
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
public class RomanToInt {


	HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main (String args[]) {
		RomanToInt rmti =  new RomanToInt();
		
		//Some Test cases, more on Leetcode
		System.out.println(rmti.romanToInt("IV"));
		System.out.println(rmti.romanToInt("DCXXI"));
		System.out.println(rmti.romanToInt("III"));
	}
	public RomanToInt() {
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);
		map.put("IV",4);
		map.put("IX",9);
		map.put("XL",40);
		map.put("XC",90);
		map.put("CD",400);
		map.put("CM",900);
	}



	public int romanToInt(String s) {
		//total: Total conversion value
		int total = 0;


		for(int i = 0; i < s.length(); i++){
			if(i+1 < s.length() && map.containsKey(s.substring(i,i+2))) {
				total += map.get(s.substring(i,i+2));
				i++;
			}
			else {
				total += map.get(Character.toString(s.charAt(i)));
			}

		}

		return total;
	}

}