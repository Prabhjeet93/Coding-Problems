package javacodes;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class anagram {
	
	public static boolean anagramStrings(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		else {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		}
		
		
		return true;
		
	}

	public static String reverse(String str) {
		
		String[] strarray=str.split(" ");
		StringBuilder op=new StringBuilder();
		
		for(int i=0;i<strarray.length;i++) {
			StringBuilder sb = new StringBuilder(strarray[i]);
			
		 op =op.append(" ").append(sb.reverse());
		}
		return op.toString();
	}

	
	/*public void logic() {
		
		Select sl = new Select(wb);
		
		List<WebElement> ls = sl.getOptions();
		
		for(WebElment w:ls) {
			String s = w.getText();
			sl.selectByValue(s);
		}
		for(int i =0;i<ls.size();i++) {
			String s = ls.get(i).getText();
			w.selectByIndex(i);
		}
		
		
	}*/
	public static void main(String[] args) {
		
		//System.out.println(anagramStrings("abcd","acde"));

		String str = "Selenium program Automation";
		
		System.out.println(reverse(str));
		//op - muine
		
	}

	
	/*public void db() {
		
		Connection con = DriverManager.getConnection(url, user,pwd);
		
		Statement st - con.createStatement();
		
		String s = "query";
		
	}
	Response re = given().queryParam("id","value")
	.header()
	when()
	.get(//url/{id})
			Jasonpath js = new 
			
			{emp{
				id:[1,
				    2,
				    3]
				    		
				    		WebDriver dr 
				    		if(brow ===chrome)
				    			driver= new ChromeDriver();
			}*/
}
