package assinment_1;

import java.util.HashMap;

public class Count_char_occurance {
	public static void main(String args[]) {
		String s = "java Programming Java OOps";
		int total_count = s.length();
		int total_count_afterRemove = s.replace("a", "").length();
		int count = total_count - total_count_afterRemove;
		System.out.println("number occurance of a is : " + count);
		
		
		
		String w = "aaabbccde";
		
		HashMap<Character, Integer> ca = new HashMap<Character, Integer>();
		
		char ch[] = w.toCharArray();
		
		for(char c : ch)
		{
			if(ca.containsKey(c))
			{
				ca.put(c, ca.get(c)+1);
			}
			else
			{
				ca.put(c, 1);
			}
		}
		System.out.println(w + " : " + ca);
		
	}
}
