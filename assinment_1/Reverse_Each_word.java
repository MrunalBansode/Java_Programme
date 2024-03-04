package assinment_1;

public class Reverse_Each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String s = "Welcome to java";
		String[] words = s.split(" ");
		String reverse_string = " ";
		for (String w:words)
		{
			String reverse_words = " ";
			for (int i=w.length()-1; i>=0; i--)
			{
				reverse_words = reverse_words+w.charAt(i);
				
			}
			reverse_string = reverse_string+reverse_words+" ";
		}
		
			System.out.println(reverse_string);
*/		
		
		//approach 2
		
		String s = "Welcome to java world";
		
		String[] words = s.split(" ");
		
		String reverseword = " ";
		for(String w : words)
		{
			StringBuilder obj = new StringBuilder(w);
			obj.reverse();
			reverseword = reverseword + obj.toString() + " ";
		}
		System.out.println(reverseword);
	}

}
