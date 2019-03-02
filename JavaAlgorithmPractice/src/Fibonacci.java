
public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static int fibonacci(int n){
		if(n==1)
		{
			return 1;
		}
		else if(n==2){
			return 1;
		}
		else{
			return fibonacci(n -1) + fibonacci(n-2);
		}
	}

	public static void testFibonacci(){
		System.out.println(fibonacci(10));
	}
}
