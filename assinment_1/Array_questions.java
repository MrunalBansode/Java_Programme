package assinment_1;
import java.util.*;

public class Array_questions {
	public static void main(String[] args) {
		
/*	int a[] = {122,123,123,45,23,23}; // one dimensional array single column,multiple rows
	 
	//Size/length of array
	
	System.out.println(a.length);
	
	
	//get single value
	
	System.out.println(a[3]);
	
	//get all values of array
	
	System.out.println(Arrays.toString(a));
	
	//get all values using loops
	
	for(int i = 0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
	//get all values using enhanced loop
	
	for(int x:a)
	{
		System.out.println(x);
	}
*/	
	
	//Remove duplicates from array
	 String[] s = {"a" , "b" , "c" , "a", "d", "c"};
	 System.out.println("array with duplicates : " + Arrays.toString(s));
	 List <String> list = Arrays.asList(s);
	 HashSet <String> set = new HashSet <String>(list);
	 System.out.println("array without duplicates "+ set);
	 
	 //Remove duplicates from arraylist
	 ArrayList <Integer> lists = new ArrayList<Integer>();
	 lists.add(23);
	 lists.add(34);
	 lists.add(56);
	 lists.add(23);
	 lists.add(67);
	 lists.add(56);
	 System.out.println("list with duplicates " + lists);
	 HashSet <Integer> sets = new HashSet <Integer>(lists);
	 System.out.println("list without duplicates " + sets);
	 
	 String str = "Mrunal";
	 char[] st = str.toCharArray();
	 HashMap <Character, Integer> hm = new HashMap <Character, Integer>();
	 for(char ch : st)
	 {
		 if(hm.containsKey(ch))
		 {
			 hm.put(ch, hm.get(ch)+1);
		 }
		 else
		 {
			 hm.put(ch, 1);
		 }
	 }
	 System.out.println(str + ":" + hm);
	 
	 
 }
}
