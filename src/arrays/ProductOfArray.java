package arrays;

public class ProductOfArray {
	
	public static int[] prodArr(int[] a) {
		
		//int[] a={1,2,3,4}
		//int[] output={24,12,8,6}
		
		int prod = 1;
		for(int p:a)
			prod=prod*p;
		
		for(int i=0;i<a.length;i++) {
			a[i]=prod/a[i];
		}
		
		return a;
		
	}
	
	public static int[] productExceptSelf(int[] nums) {
	    int[] result = new int[nums.length];
	 
	    int[] t1 = new int[nums.length];
	    int[] t2 = new int[nums.length];
	 
	    t1[0]=1;
	    t2[nums.length-1]=1;
	 
	    //scan from left to right
	    for(int i=0; i<nums.length-1; i++){
	        t1[i+1] = nums[i] * t1[i];
	    }
	 
	    //scan from right to left
	    for(int i=nums.length-1; i>0; i--){
	        t2[i-1] = t2[i] * nums[i];
	    }
	 
	    //multiply
	    for(int i=0; i<nums.length; i++){
	        result[i] = t1[i] * t2[i];
	    }
	 
	    return result;
	}

	public static int[] productExceptSelf1(int[] nums) {
	    int[] result = new int[nums.length];
	 
	    result[nums.length-1]=1;
	    for(int i=nums.length-2; i>=0; i--){
	        result[i]=result[i+1]*nums[i+1];
	    }
	 
	    int left=1;
	    for(int i=0; i<nums.length; i++){
	        result[i]=result[i]*left;
	        left = left*nums[i];
	    }
	 
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3,4};
		
		//int[] q=prodArr(a);
		int[] q=productExceptSelf1(a);
		
		for(int r:q)
			System.out.println(r);
	}

}
