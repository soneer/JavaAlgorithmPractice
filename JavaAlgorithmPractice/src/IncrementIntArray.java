import java.util.Arrays;

public class IncrementIntArray {

	public IncrementIntArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static int[] incrementIntArray(int[] array){
		int[] incrementedArray;
		if(array.length >= 2 && array[0]+array[1] == 18){
			incrementedArray = new int[array.length+1];

			incrementedArray[0]=1;
		}
		else{
			incrementedArray = new int[array.length];
		}
		int carry = 1;
		for(int i = array.length -1; i >= 0; i--){
			if(array[i] == 9){
				carry = 1;
				incrementedArray[i] = 0;
			}
			else{
				incrementedArray[i] = array[i]+carry;
				carry = 0;
			}
			
		}
		if(incrementedArray.length!= array.length){
			incrementedArray[0]=1;
		}
		return incrementedArray;
	}

	public static void testIncrementedArray(int[] array){
		
		System.out.println("Input Array:"+ Arrays.toString(array));
		System.out.println("Incremented Array:"+Arrays.toString(incrementIntArray(array)));
	}
}
