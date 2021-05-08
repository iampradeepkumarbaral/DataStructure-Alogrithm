public class RecuursiveRange {
    
	public static void main(String[] args) {
		RecuursiveRange rr = new RecuursiveRange();
		System.out.println(rr.recursiveRange(10));
		
	}

   public int recursiveRange(int num) {  
  
		if(num<0){

			return 0;

		 }

   		return num + recursiveRange(num-1);
   } 


}