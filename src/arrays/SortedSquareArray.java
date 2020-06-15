package arrays;

public class SortedSquareArray {
	
public static int[] sortedSquares(int[] A) {
        
        int len=A.length;
        int[] arr = new int[len];
        int j=len-1; 
        for(int k=0;k<len;k++){
            
        	System.out.println();
        	System.out.println(" value of J : "+j);
            //  [-3,-3,-2,1], [1,9,4,9]
            if(j>=0){
        	
        	
            if(Math.abs(A[0])<Math.abs(A[j])){
                
               arr[j]=A[j]*A[j];
                j--;
             }
               else{
                   int temp=A[0];
                   A[0]=A[j];
                   A[j]=temp;
                   arr[j]=A[j]*A[j];
                  j--; 
                 //  System.out.print(Math.abs(arr[j]));
               }
            
            System.out.println("Result Array at "+k+" loop and j: "+j);
        	for(int r:arr) {
    			System.out.print(r);
    			System.out.print(", ");
    			
        	}
           if((j<len-2)&&(j>=0)){
        	   System.out.println("Inside last if "+j);
               if(arr[j+1]>arr[j+2]){
            	   
                int temp=arr[j+1];
                   arr[j+1]=arr[j+2];
                   arr[j+2]=temp; 
                   //System.out.println(Math.abs(arr[j]));
            }
           }
           
            }   
        }
        return arr;
            }
    
        


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] a= {-3,-3,-2,1};
		
		//int[] q=prodArr(a);
		int[] q=sortedSquares(a);
		
		for(int r:q)
			System.out.println(r);

	}

}
