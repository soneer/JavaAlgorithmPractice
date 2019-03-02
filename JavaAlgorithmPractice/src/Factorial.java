
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	public static int factorial(int n){
		
		if(n==1){
			return n;
		}
		else{
			return n * factorial(n-1);
		}
	}
	
	public static void testFactorial(){
		System.out.println("Factorial 10 test:\r Expected = 3628800");
		System.out.println("Actual = "+Factorial.factorial(10));
		
	}
}
