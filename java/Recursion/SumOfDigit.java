public class SumOfDigit{
	public static void main(String[] args) {
		SumOfDigit sm = new SumOfDigit();
			System.out.println(sm.sumOgDigit(111));
		
	}

	public int sumOgDigit(int n){

		if(n<0){
			return -1;
		}
		if(n==0 || n< 0){
			return 0;
		}
		return n%10 +sumOgDigit(n/10);
	}
}