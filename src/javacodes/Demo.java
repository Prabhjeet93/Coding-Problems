package javacodes;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
	
	public static boolean lemon(int[] arr){
				
		HashMap<Integer, Integer> hp= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Arr : "+arr[i]);
			hp.forEach((K,V)->System.out.println(K+" ---: "+V));
			switch(arr[i]) {
			
			case 5: {	
			  if(hp.containsKey(5)) {
				  hp.put(5, hp.get(5)+1);
			  }
			  else
			     hp.put(5,1);
			  break;
			}
			case 10: {
				 if(hp.containsKey(5)) {
				    hp.put(5, hp.get(5)-1);
				   if(hp.containsKey(10)) {
					  hp.put(10, hp.get(10)+1);
					  }
					 else
					     hp.put(10,1);
				  }
				 else {
					 return false;
				 }
				break;
			}
			case 20 : {
			  if(hp.containsKey(5) && hp.containsKey(10)) {
				  hp.put(5, hp.get(5)-1);
				  hp.put(5, hp.get(10)-1);
				  if(hp.containsKey(20)) {
					  hp.put(20, hp.get(20)+1);
				  }
				 else
				     hp.put(20,1);
			  }
			  else if(hp.get(5)>=3) {
				  hp.put(5, hp.get(5)-3);
			  }
			 else {
				 return false;
			 }
			  break;
			}
			default:{
				return false;
			}
	       }
		
		}
		return true;		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {5,5,10,20};

    System.out.println(lemon(arr));
	}

}
