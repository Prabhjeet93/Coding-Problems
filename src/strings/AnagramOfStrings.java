package strings;

public class AnagramOfStrings {

	static int count=0;
	public static void main(String[] args) 
    {
        String str = "PRABH"; 
        System.out.println("String is:-"+str);
        System.out.println("Anagram of the given string is:-");
        int size = str.length(); 
        AnagramOfStrings a = new AnagramOfStrings(); 
        a.anagm(str, 0, size - 1); 
        System.out.println("Count : "+count);
    } 
    private void anagm(String str, int start, int end) 
    { 
    	count++;
        if (start == end) 
            System.out.println(str); 
        else { 
            for (int i = start; i <= end; i++) { 
                str = swap(str, start, i); 
                anagm(str, start + 1, end); 
                str = swap(str, start, i); 
            } 
        } 
    } 
    public String swap(String a, int i, int j) 
    { System.out.println("Before Swap : "+a);
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp;
        System.out.println("after Swap : "+String.valueOf(charArray));
        return String.valueOf(charArray); 
        
    } 


}
