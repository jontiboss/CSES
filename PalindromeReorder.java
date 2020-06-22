import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;





public class PalindromeReorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = new Reader();
		String word = reader.next();
		boolean flag = true;
		String middle = "";
		StringBuilder sb = new StringBuilder();
		
		
		//create an array that could store all the letters from A-Z.
		int[] letters = new int[26];
		
		//Count how many times each character is occurring.
		for(int i =0;i<word.length();i++) {
			letters[word.charAt(i)-65]++;	
			}
		//loop trough the characters.
		for(int k =0;k<26;k++) {
			//if there is multiple characters with an odd occurrence.
			if(letters[k]%2==1 && middle!="") {
				System.out.println("NO SOLUTION");
				flag=false;
				break;
			}
			//adds a character with an odd length K that could be in the middle.
			else if(letters[k]%2==1) {
				middle = Character.toString(k+65).repeat(letters[k]);
			}
			//if its even, we just add half of the length to our string.
			else {
				sb.append(Character.toString(k+65).repeat(letters[k]>>1));
			}
			
		}
		//if there is an solution, print it.
		if(flag) {
			System.out.println(sb.toString()+ middle+ sb.reverse().toString());	
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
