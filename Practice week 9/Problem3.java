import java.io.*;
import java.util.*;
 public class Problem3 {
	 public static void main(String[] args) throws Exception
    {
		FastReader fr=new FastReader();
        int n=fr.nextInt();
       StringBuilder rom = new StringBuilder();
	 int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] mappingVals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};	 

        for(int i=0;i<vals.length;i++) {
            while(n>= vals[i]) {
                n -= vals[i];
                rom.append(mappingVals[i]);
            }
        }
        System.out.println("Roman: " + rom.toString());
    	
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
