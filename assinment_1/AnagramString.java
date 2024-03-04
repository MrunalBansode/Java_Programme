package assinment_1;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "race";
		String s1 = "care";
		char[] a = s.toCharArray();
		char[] a1 = s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(a1);
		if(s.length() == s1.length()) {
			if(Arrays.equals(a, a1))
			{
				System.out.println("String anagram");
			}
		}
		else
		{
			System.out.println("not String anagram");
		}
	}

}
