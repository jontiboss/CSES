import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CreatingStringsI {
	static int combinations = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		String word = reader.next();
		
		
		//Sort the string
		 char temp[] = word.toCharArray();
		 Arrays.sort(temp);
		 word = new String(temp);
		 //Iterate thought all the combination using recursion.
		permutation(word, "");
		System.out.println(combinations + "\n" + sb.toString());
		}
	
	 static void permutation(String word, String answer){
		
		 
	        if (word.length()== 0) { 
	        	combinations++;
	            sb.append(answer + "\n" );
	            return; 
	        } 
	        
	      boolean usedChar[] = new boolean[26]; 
		 for(int i =0;i<word.length();i++) {
			 char temp = word.charAt(i);
			 String rest = word.substring(0,i) + word.substring(i+1);
			 if (usedChar[temp - 'a'] == false) 
				 permutation(rest,answer+temp); 
	            usedChar[temp - 'a'] = true; 
			 
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
	}
}
