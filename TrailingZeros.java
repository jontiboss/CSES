import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class TrailingZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* The idea is to count how many five's and two's prime factors there is in n!
		 * this is because 2*5=10 and will result in an trailing zero.
		 * we also know that there will always be less 5 factors than two factors, so  we only need to count the 5 factors. 
		 * 
		 */
		Reader reader = new Reader();
		long n = reader.nextLong();
		int zeroes=0;
		 for (int i = 5; n / i >= 1; i *= 5) 
	            zeroes+= n / i; 
		System.out.println(zeroes);
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

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 
		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
}
