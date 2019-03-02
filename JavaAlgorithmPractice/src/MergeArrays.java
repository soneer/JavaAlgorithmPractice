import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays {

	public MergeArrays() {
		// TODO Auto-generated constructor stub
	}
	public static int[] simpleMerge(int[] arrayOne, int[] arrayTwo){
		int[] mergedArray = new int[arrayOne.length+arrayTwo.length];
		
		for(int i = 0; i < arrayOne.length; i++){
			mergedArray[i] = arrayOne[i];
		}
		
		for(int j = 0; j < arrayTwo.length; j++){
			mergedArray[arrayOne.length+j] = arrayTwo[j];
		}
		return mergedArray;
		
	}
	
	public static int[] sortedMerge(int[] arrayOne, int[] arrayTwo){
		int[] mergedArray = simpleMerge(arrayOne, arrayTwo);
		Arrays.sort(mergedArray);
		return mergedArray;
	}
	public static HashSet<Integer> sortedUniqueMerge(int[] arrayOne, int[] arrayTwo){
		int[] mergedArray = sortedMerge(arrayOne, arrayTwo);
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < mergedArray.length; i++){
			set.add(mergedArray[i]);
		}
		return set;
		
	}
	
	public static void mergeNArrays(int[][] arrays){
		int[] array =  new int[0];
		for(int i = 0 ; i< arrays.length; i++){
			array = simpleMerge(array, arrays[i]);
		}
		
		System.out.println("Merge "+arrays.length+" arrays:"+Arrays.toString( array));
	}
	
	public static void testMergeArrays(int[] arrayOne, int[] arrayTwo){
		//REMEMBER Array.toString(array) to print default arrays!!!!!!!!!!!
		System.out.println("Array One:"+ Arrays.toString(arrayOne));
		System.out.println("Array Two:"+ Arrays.toString(arrayTwo));
		
		System.out.println("Simple Merge:"+ Arrays.toString(simpleMerge(arrayOne, arrayTwo)));
		System.out.println("Sorted Merge:"+ Arrays.toString(sortedMerge(arrayOne, arrayTwo)));

		System.out.println("Sorted Unique Merge:"+ (sortedUniqueMerge(arrayOne, arrayTwo)).toString());
		
	}
}
