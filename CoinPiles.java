import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		long tests = reader.nextLong();
		for(int i =0;i<tests;i++) {
			long a = reader.nextLong();
			long b = reader.nextLong();
			if((a+b)%3 == 0 && (a<<1)>=b && (b<<1)>=a) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
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
