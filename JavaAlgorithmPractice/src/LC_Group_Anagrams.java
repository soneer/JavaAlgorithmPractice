import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * 
 * @author Soneer Sainion
 * 
 * Leetcode question: Group Anagrams
 * https://leetcode.com/problems/group-anagrams
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */

public class LC_Group_Anagrams {

	public static void main(String args[]) {
		//Create a class instance for orderedAnagraming
		LC_Group_Anagrams test = new LC_Group_Anagrams();
	}
	
	public LC_Group_Anagrams() {
		//example string
		String[] example = {"eat", "tea", "tan", "ate", "nat", "bat"};

		System.out.println(groupAnagrams(example));

	}
	
	public ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		//Hash map will store ordered anagrams as key
		HashMap<String,ArrayList<String>> orderedAnagram = new HashMap<String, ArrayList<String>>();

		
		String currentSort = "";
		for(int i = 0; i < strs.length; i++){
			currentSort = sort(strs[i]);
			//Prime the Hash Map
			if(i == 0) {
			orderedAnagram.put(currentSort, new ArrayList<String>(Arrays.asList(strs[i])));
			}
			
			//If an anagram of current string exists, then insert that string into the array of anagrams in Hash Map
			else if(orderedAnagram.containsKey(currentSort)){
				orderedAnagram.get(currentSort).add(strs[i]);
			}
			
			//Create new sorted key and make a new List with current string
			else{
				orderedAnagram.put(sort(strs[i]), new ArrayList<String>(Arrays.asList(strs[i])));
			}
		}
		
		//Return a List of all values of Hash Map
		return new ArrayList<ArrayList<String>>(orderedAnagram.values());
	}
	
	//Helper to help sort strings
	public String sort(String str){
		char[] arr1 = str.toCharArray();
		Arrays.sort(arr1);
		return Arrays.toString(arr1);
	}
}
