package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		
		SingleNumber sn=new SingleNumber();
		
		int[] arr= {2,1,3,4,3,2,1};
		
  System.out.println(sn.singleNum(arr));
	}
	
	public int singleNum(int[] ar) {
		int num = 0;
    HashMap<Integer, Integer> hmap= new HashMap<Integer, Integer>();
		
		for(int i=0;i<ar.length;i++) {
			
			if(hmap.containsKey(ar[i]))
			      hmap.put(ar[i], 2);
			else
				hmap.put(ar[i], 1);
			
		}
		
		for(Map.Entry map: hmap.entrySet()) {
			
			int key = (int) map.getKey();
			int val=(int) map.getValue();
			if(val==1) {
				num=key;
				break;
			}
			
		}
		
		hmap.forEach((k,v) -> {
			//if(v==1)
			System.out.println(k+" **** "+v);
			
		});
	
		
		return num;
	}

}
