import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NumberSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   The idea is to compute the the numbers noted with "(x)", coordinates where x=y, this value
		 *   will always be the same independent on which way we traverse on the grid.
		 *   to compute the value you can use following formula z = Max(x,y)^2 - (max(x,y)-1)
		 *   then we compute the absolute value between x and y.
		 *   depending if max(x,y) is even or odd we will traverse in the grid differently.
		 *   
		 *   
		 *   Traversing rules.
		 *   if max is odd and x>y you will traverse to the right, and the values is decreasing if you move to the right.
		 *   if max is odd and x<y you will traverse upwards, and the values is  increasing if you move upwards.
		 *   
		 *   for even numbers the increasing/decreasing order is inverse.
		 *   
		 *   
		 *   E.G we want to know the value for (3,1).
		 *   first we compute the value of (3,3)=7 and then we compute  the difference |x-y|=|3-1|=2
		 *   since max(x,y)=3 and 3 is odd, we will subtract 2 from 7. 
		 *   answer = 7-2=5
		 *   
		 *  
		 *   The Grid
		 *   (1)  2   9   10  25
		 *    4  (3)  8   11  24
		 *    5   6  (7)  12  23
		 *    16  15  14 (13) 22
		 *    17  18  19  20 (21)
		 */
		Reader reader = new Reader();
		int nbr = reader.nextInt();
		
		for(int i =0;i<nbr;i++) {
			long x = reader.nextLong();
			long y = reader.nextLong();
			long max = Math.max(x, y);
			long diagonal = max*max-(max-1);
			long diff = Math.abs(x-y);
			if(max%2!=0) {
				if(x>y) {
					diagonal -= diff;
				}
				if(x<y) {
					diagonal += diff;
				}
			}
			
			else {
				
			
				if(x<y) {
					diagonal -= diff;
				}
				if(x>y) {
					diagonal += diff;
				}
			}
			
			System.out.println(diagonal);

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

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 
	}
}
