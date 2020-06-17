import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Repetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		String dna = reader.next();
		int longest =1,current = 1;
		for(int i =0;i<dna.length()-1;i++) {
			if(dna.charAt(i)==dna.charAt(i+1)) {
				current++;
			}
			else {
				current=1;
			}
			if(current>longest) {
				longest=current;
			}
		}
		System.out.println(longest);
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
