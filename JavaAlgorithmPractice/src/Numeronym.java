import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Numeronym {
HashMap<String, HashSet<String>> numeronymDictionary;
	public Numeronym(String dict) {
		numeronymDictionary = new HashMap<>();
		parseDictonary(dict);
		printDic();
	}

	
	public String createNumeronym(String word){
		String num = "";
		if(word.length()>2){
			num = Character.toString(word.charAt(0))+ (word.length()-2) + Character.toString(word.charAt(word.length()-1));
		}
		else{
			//edge case
		}
		return num;
	}
	
	public void parseDictonary(String dict){
		
		for(String currentWord : dict.split(",")){
			String currentNum = createNumeronym(currentWord);
			System.out.println(currentWord + "  |  "	+ currentNum);
			if(numeronymDictionary.containsKey(currentNum)){
				numeronymDictionary.get(currentNum).add(currentWord);
			}
			else{
				HashSet<String> currentSet = new HashSet<String>();
				currentSet.add(currentWord);
				numeronymDictionary.put(currentNum, currentSet);
			}
		}
	}
	
	public boolean isUniqueNumeronym(String word){
		String num = createNumeronym(word);
		if(numeronymDictionary.containsKey(num)){
			System.out.println(numeronymDictionary.get(num).contains(word) +" | "+ numeronymDictionary.get(num));
			if(numeronymDictionary.containsKey(num) && numeronymDictionary.get(num).size()>1){
				
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return true;
		}
	}
	public void printDic(){
		for(String cs : numeronymDictionary.keySet()){
			System.out.println(cs +" size:"+ numeronymDictionary.get(cs).size());
		}
	}
	
	
	
}
