package arrays;

import java.util.ArrayList;

public class HappyNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumb hp = new HappyNumb();
		int n=17;
		boolean p =hp.isHappy(n);
		System.out.println(p);

	}
	
	public boolean isHappy(int n) {
        if(n==1)
            return true;
        else if(n==0)
        	return false;
        else{
        	//int sq;
        	ArrayList<Integer> pl=HappyNumb(n);
            // for loop to get the sq of array ints
        	int sq=squareOfList(pl);
            //call isHappy();
        	if(sq==1)
        		return true;
        	else 
        		return isHappy(sq);
            
       }
		
    }
    
    public static ArrayList HappyNumb(int n){
    	ArrayList<Integer> al = new ArrayList();
    	
    	while(n!=0) {
    	int rem=n%10;
    	al.add(rem);
    	n=n/10;
    	}
    	
      return al;  
    }
    
    public static int squareOfList(ArrayList pl) {
    	int sq = 0;
    	for(int i=0;i<pl.size();i++) {
    		sq=(int) (pl.get(i))*(int) (pl.get(i));
    	}
		return sq;
    	
    }

}
