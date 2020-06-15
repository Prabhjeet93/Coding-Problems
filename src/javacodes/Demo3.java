package javacodes;

public class Demo3 {
	
	public static void mult2(int n, int m) {
		System.out.println("n*m : "+n*m);
		
		int sum2=0;
		int count1=1;
		while(n>0 ) {
				
				int rem1=(n%10)*count1;
				int p=m;
				int count2=1;
				int sum1=0;
				while(p>0) {
					
					int rem2=(p%10)*count2;
					sum1=sum1+rem1*rem2;
					count2=count2*10;
					p=p/10;
					
				}
				sum2=sum1+sum2;
				count1=count1*10;
				n=n/10;
		}
			System.out.println("Sum2: "+sum2);
}
	
	public static void main(String[] args) {
		mult2(67342,8765);
	}
}

