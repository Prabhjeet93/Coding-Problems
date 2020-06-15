import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Setss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int countElements(int[] arr) {
        
	 Set<Integer> lookup = new HashSet<>();
	 
	 
     for(Integer i: arr){
         lookup.add(i);
     }

     int count =0;

     for(Integer i:arr){
         if(lookup.contains(i+1)){
             count++;
         }
     }
     return count;
 }
   
        
    }


