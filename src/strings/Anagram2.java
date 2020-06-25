package strings;

import java.util.HashSet;
import java.util.Set;

public class Anagram2 {
	static int count=0;
	static Set<String> set=new HashSet<>();
	public static void anagramss(String str, String ans) {
		
		
		if(str.length()==0) {
			count++;
		//	System.out.println("ans : "+ans);
			set.add(ans);
			//return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);
			//System.out.println("ros : "+ros+" ans+ch : "+(ans+ch));
			anagramss(ros,ans+ch);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagramss("jeet","");
		System.out.println("Size of Set : "+set.size());
		for(String p:set) {
			System.out.println(p);
		}
		System.out.println("Count : "+count);
	}

}
