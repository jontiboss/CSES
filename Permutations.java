import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		int nbrs = reader.nextInt();
		StringBuilder sb = new StringBuilder();
		boolean even = false;
		if(nbrs==1) {
			System.out.println(1);
		}
		if(nbrs==2||nbrs==3) {
			System.out.println("NO SOLUTION");
		}
		//first print all even numbers, and then print all odd numbers.
		//Using multiple print lines will slow down the program, so its better to use a string builder and then just print it once.
		if(nbrs%2==0) {
			even = true;
		}
			for(int i = 2;i<nbrs; i= i+2) {
				sb.append(i + " ");
			}
			if(even) {
				sb.append(nbrs + " ");
			}
			for(int i = 1;i<nbrs; i= i+2) {
				sb.append(i + " ");
			}
			if(!even) {
				sb.append(nbrs);
			}
		System.out.println(sb.toString());
		
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
