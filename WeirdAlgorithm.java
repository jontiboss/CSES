import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		Long nbr = reader.nextLong();
		while(nbr!=1) {
			System.out.print(nbr + " ");
			if(nbr%2==0) {
				nbr = nbr>>1;
			}
			
			else {
				nbr = nbr*3+1;
			}
			
		}
		System.out.print(1);
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

		Long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 
	}
}
