import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		long nbrs = reader.nextLong();
		long rounds = 0;
		long max = 0;
		// for each iteration we see how many rounds we need to increment the value so its par up with the previous one.
		// E.G R1    {3,2,5,1,7}  max=0,temp=3,rounds= 0 
		/* 	   R2    {3,3,5,1,7}, max=3,temp=2,rounds= 3-2=1
		 *     R3    {3,3,5,1,7}, max=temp=5,  rounds= 0
		 * 	   R4    {3,3,5,5,7}, max=5,temp=1,rounds = 5-1=4
		 * 	   R5    {3,3,5,5,7}, max=temp=7,  rounds= 0
		 * 		total sum is R1.rounds+R2.rounds +...+R5.rounds
		 */
		for(int k =0;k<nbrs;k++) {
			long temp = reader.nextLong();
			max = Math.max(max, temp);
			rounds +=max-temp;
		

	}
		System.out.println(rounds);
	}
	static class Reader 
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

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
}
