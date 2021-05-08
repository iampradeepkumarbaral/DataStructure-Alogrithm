
// Fibonacci Number

//eg:0,1,1,2,3,5,8,13,21,34,55,89....

//f(n) = f(n-1) + f(n+2)


public class FibonacciSeries{
	public static void main(String[] args) {

		FibonacciSeries mainSeries = new FibonacciSeries();
		var rec = mainSeries.fibonacci(3);
		System.out.println(rec);
		
	}

	public int fibonacci(int n){
		return fibonacci(n-1)+fibonacci(n-2);
	}
}