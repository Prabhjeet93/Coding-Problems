package javacodes;

public class demo2 {
	
	
	public static void mult1(int n, int m) {
		System.out.println("n*m : "+n*m);
		int sum=0;
		int count=1;
			while(n>0) {
			int rem=n%10;
			System.out.println("rem : "+rem);
			 sum +=rem*m*count;
			 count=count*10;
			n= n/10;
			System.out.println("n : "+n);
		}
		System.out.println("sum : "+sum);
		
		
	}

	
	
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // mult2(273,165);
		 mult1(12,17);
				}

}
