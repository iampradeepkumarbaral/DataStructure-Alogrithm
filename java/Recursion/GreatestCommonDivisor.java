//Greatest Common Divisor
public class GreatestCommonDivisor{
	public static void main(String[] args) {
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		System.out.println(gcd.gcdmethod(4,8));
	}
	 public int gcdmethod(int a,int b){

	 	if(a<0 ||b<0){
	 		return -1;
	 	}

	 	if(b == 0){
	 		return a;
	 	}
	 	return gcdmethod(a,a%b);
	 }
}