public class ProductOfArray{
	public static void main(String[] args) {

		ProductOfArray pa= new ProductOfArray();
		int arr[] = {1,2,3,4,5};
		System.out.println(pa.productofArray(arr,arr.length));
	}

    public int productofArray(int A[], int N){ 
    //    TODO
    	if(N==0){
    		return 1;
    	}
        return A[N-1]*productofArray(A,N-1);
    } 
}