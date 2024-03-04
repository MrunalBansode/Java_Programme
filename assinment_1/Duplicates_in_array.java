package assinment_1;

import java.util.HashSet;

public class Duplicates_in_array {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		String arr[] = {"java", "c","c++","python","java","c"};
		
		boolean a = false;
		 for(int i=0; i<arr.length; i++)
		 {
			 for(int j=i+1; j<arr.length; j++)
			 {
				 if(arr[i] == arr[j])
				 {
					 System.out.println("found duplicate elements :" + arr[i]);
					 a=true;
				 }
			   }
		}
		if(a==false)
		 {
			 System.out.println("not found duplicate element");
		 }
*/		
		//approach 2
		
		String arr[] = {"java", "c","c++","python","java","c"};
		HashSet<String>a = new HashSet();
		
	/*	System.out.println(a.add("java"));
		System.out.println(a.add("c++"));
		System.out.println(a.add("java"));
	*/
		boolean b = false;
		for(String l : arr)
		{
			if(a.add(l)==false)
			{
				System.out.println("found duplicate elements :" + l);
				b=true;
			}
		}
		if(b==false)
		{
			 System.out.println(" not found duplicate element");
		}
	}

}
