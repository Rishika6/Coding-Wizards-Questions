import java.io.*;
import java.util.*;
 public class Problem1 {
	 public static void main(String[] args) throws Exception
    {
		FastReader fr=new FastReader();
	   /*Q1. You are provided with an array of numbers and 
	    * the task is to find triplets in the array which adds up to a given value. 
	    * If there is such a triplet present in array, then print the triplet.*/
		
		int n=fr.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=fr.nextInt();
		}
		
		int sum=fr.nextInt();
		boolean pos=false;
		for(int i=0;i<n;i++) {
			Set<Integer> set=new HashSet<>();
			int f=sum-a[i];
			for(int j=i+1;j<n;j++) {
				int k=f-a[j];
				if(set.contains(k)) {
					pos=true;
					System.out.println(a[i]+" "+a[j]+" "+k);
					break;
				}
				else {
					set.add(a[j]);
				}
			}
		}
		if(pos==false)
			System.out.println("not found");
	          
      }
	 
	
 }

  

class FastReader
{
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }
 
    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    int nextInt()
    {
        return Integer.parseInt(next());
    }
 
    long nextLong()
    {
        return Long.parseLong(next());
    }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
 
    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
