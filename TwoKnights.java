import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoKnights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		/* first calculate the area of the grid which is equal to area = base*base=base^2
		 * then calculate how many different positions you could place the two knights which could be 
		 * computed using the sum formula area*(area-1)/2 , area=base^2
		 * two knights could attack each other in an L shape and the attack form 3x2 or 2x3 blocks.
		 * in each block figure you could place the knights in two different places so they could attack each other.
		 * so you would have 4*(n-1)(n-2) for the general case, and for areas below 9 or a side smaller than 3
		 * you can't make any 3x2 or 2x3 squares so the knights will not be able to attack each other.
		 * 
		 */
		int k = reader.nextInt();
		for(int i = 1;i<=k;i++) {
			
			long area = i*i;
			long sumOfAttacks = 0;
			long sumOfPossitions = (area*(area-1))>>1;
			if(i>2) {
				sumOfAttacks = ((i-1)*(i-2))<<2;
			}
			
			System.out.println(sumOfPossitions-sumOfAttacks);
			
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


		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 
	}
}
