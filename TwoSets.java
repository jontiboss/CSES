import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class TwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calculate the total sum of the set with the sum formula nbrs(nbrs+1)/2
		 * if the sum is even then we know we could split the sum into two even subsets.
		 * so each set will have a total sum of nbrs(nbrs+1)/4.
		 * the algorithm used to divide the total set into two even subset is to add all (nbrs-i) into a set and then remove nbrs-i from the value we need to reach and keep the remainder
		 * we then repeat this until the remainder is equal to zero.
		 * for each number that did  not meet this requirement, is going to be stored in the other set
		 * 
		 * 
		 * StringBuidler is used to minimize the slow output of java.
		 */
		Reader reader = new Reader();
		int nbrs = reader.nextInt();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		if(nbrs*(nbrs+1)%4 != 0) {
			System.out.println("NO");
		}
		else {
			BigInteger split =  BigInteger.valueOf(nbrs);
			split = split.multiply(split.add(BigInteger.ONE)).divide(BigInteger.valueOf(4));
			int temp = 0;
			System.out.println("YES");
			for(int i =nbrs;i>0;i--) {
				if(BigInteger.valueOf(i).compareTo(split) <= 0) {
					sb1.append(i + " ");
					split = split.subtract(BigInteger.valueOf(i));
					temp++;
					}
				else {
					sb2.append(i + " ");
				}
			}
			 System.out.println(temp);
			 System.out.println(sb1.toString());
			 System.out.println(nbrs-temp);
			 System.out.println(sb2.toString());
			
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
