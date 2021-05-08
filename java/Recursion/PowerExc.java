public class PowerExc{
	public static void main(String[] args) {
		PowerExc px = new PowerExc();
		System.out.println(px.power(6,2));
	}

	public int power(int base,int exc){

		if(exc==0 || exc == 1){
			return base;
		}
		return base * power(base,exc-1);
	}
}