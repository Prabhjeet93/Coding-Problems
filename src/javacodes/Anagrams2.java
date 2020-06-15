package javacodes;

public class Anagrams2 {
	
	public static void display(String s1, String s2)
    {
		if(s2.length()<=1)
        {
        
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                String y = s2.substring(0, i);
                String z = s2.substring(i+1);
               
                display(s1+x, y+z);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display("","member");
		String s= "A man, a plan, a canal: Panama";
		
		String[] str= s.split("[, :]+");
		
       StringBuilder sb=new StringBuilder();
        
        for(String p:str){
            sb.append(p.toLowerCase());
        }
        System.out.println(sb);
	}

}
