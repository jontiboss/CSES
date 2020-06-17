import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Since all the numbers comes in a series, where all the numbers is distinct and incremented by 1.
		// To find the missing number, first compute the complete sum using the formula y = nbrs(nbrs+1)/2.
		// subtract the sum of the set with the complete set.
		// The formula: y-sumOfSet=MissingNumber, where  y =nbrs(nbrs+1)/2.
		Reader reader = new Reader();
		long nbrs = reader.nextLong();
		long sum =0;
		for(int i=0;i<nbrs-1;i++) {
			long temp = reader.nextLong();
			sum += temp;
	}
		long completeSet = nbrs*(nbrs+1)>>1;
		System.out.println(completeSet - sum);
	
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
