import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCompare {

	public ListCompare() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setIntersection(ArrayList<Integer> A, ArrayList<Integer> B){
		ArrayList C = new ArrayList<Integer>();
		C.addAll(A);

A.removeAll(B);
B.removeAll(C);
	System.out.println(A);

	System.out.println(B);

		
	}
	
	public static void testGQ1ListCompare(){
		ArrayList<Integer> listA = new ArrayList<Integer>( Arrays.asList(5,3,3,44, 4, 4));
		ArrayList<Integer> listB = new ArrayList<Integer>(Arrays.asList(5,10, 11, 4, 4));
		
		setIntersection(listA, listB);
	}
}
