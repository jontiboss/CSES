

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;


public class AppleDivision {
static long bestDiff,sum;
static int apples;
static Vector<Long> weightOfApples = new Vector<Long>();;

/* Since the amount of apples we have is pretty small, we could use recursion and try all subsets to find
 * the smallest difference. This method is pretty easy to implement, but will not work good for big amount of apples
 * due to the time complexity
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		apples = reader.nextInt();
		//calculate the total sum and store the weight of the apples in an vector.
		for(int i =0;i<apples;i++) {
			weightOfApples.add(reader.nextLong());
			sum += weightOfApples.get(i);
		}
		bestDiff = sum;
		getSmallestDiff(0,0);
		System.out.println(bestDiff);
		}
	
	public static void getSmallestDiff(int n,long currentWeight) {
		
		if(n==apples) {
			//check if the new difference is smaller than the current one.
			bestDiff = Math.min(Math.abs((currentWeight<<1)-sum),bestDiff);
			return;
		}
		//check all subsets.
		getSmallestDiff(n+1,currentWeight);
		getSmallestDiff(n+1,currentWeight+weightOfApples.get(n));
		
	}
}
	class Reader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public Reader() 
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


