import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PraticeDataStructures {

	public PraticeDataStructures() {
		// TODO Auto-generated constructor stub
		//
		int[] testA = {1,2,3,4};
		System.out.println(testA[2]+" Array Length = "+ testA.length);
		
		ArrayList<String> testAL = new ArrayList<>(Arrays.asList("1","2","3"));
		System.out.println(testAL.get(1));
		
		//IMPORTANT
		HashMap<Integer, String> textHT = new HashMap<Integer, String> ();
		textHT.put(1, "One");
		textHT.put(2, "2");
		textHT.put(3, "thr33");
		
		 for(int key : textHT.keySet()) {
				System.out.println("Key:"+key+"   value:"+textHT.get(key));
			}
		 
		 
		 
		 String testS = "LETSDOTHISTHINGTONIGHTTOMORROWANDTHURSDAYONTHANKSGIVING";
		 int countT = 0;
		 int index = testS.indexOf("T");
		 
		 while(index!=-1){
			 countT++;
			 testS = testS.substring(index+1);
			 index = testS.indexOf("T");
		 }
		 
		 System.out.println("How Many T's?"+countT);
		 
	}

}
