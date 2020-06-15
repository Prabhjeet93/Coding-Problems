package strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class groupAnagram {

	public static void main(String[] args) {
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		grpAnagm(str);

	}
	
	public static List<List<String>> grpAnagm(String[] strs){
		
		
		List<List<String>> result = new ArrayList<List<String>>();
		 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = new char[26];
	        for(int i=0; i<str.length(); i++){
	            
	            arr[str.charAt(i)-'a']++;
	        }
	        String ns = new String(arr);
	        
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    result.addAll(map.values());
	 
	    return result;
		
		
	}
}
