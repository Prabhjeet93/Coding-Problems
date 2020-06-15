package javacodes;

public class SampleCodes {
	
	public static void hashcodess(String str) {
		//
		
		int strSize=str.length();
		
		for(int i=0;i<strSize;i++) {
			for(int j=0;j<=i;j++) {
			
			     System.out.print(str.charAt(i));
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "#######";
		hashcodess(str);

	}

}
