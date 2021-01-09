
import java.io.*;
import java.util.*;
 public class Problem2 {
	 public static void main(String[] args) throws Exception
    {
/*Write an efficient program that takes two strings as arguments and removes 
the characters from the first string, which are present in the second string.*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s1=br.readLine();
	    String s2=br.readLine();
	    char ch[]=s1.toCharArray();
	    Set<Character> set=new HashSet<>();
	    for(int i=0;i<s2.length();i++) {
	    	set.add(Character.toLowerCase(s2.charAt(i)));
	    	set.add(Character.toUpperCase(s2.charAt(i)));
	    	
	    }
	    boolean marked[]=new boolean[s1.length()];
	    for(int i=0;i<s1.length();i++) {
	    	if(set.contains(ch[i])) {
	    		marked[i]=true;
	    	}
	    }
	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<ch.length;i++) {
	    	if(!marked[i])
	    		sb.append(ch[i]);
	    }
	    System.out.println(sb.toString());
	    
       
    }
	 
	
 }

  