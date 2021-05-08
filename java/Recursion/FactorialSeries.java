//factorial series

public class FactorialSeries{
	public static void main(String[] args) {
		FactorialSeries fs = new FactorialSeries();

		System.out.println(fs.factorial(3));

	}

	public int factorial(int n){
		if(n<1){
			return -1;
		}

		if(n==0 || n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
}