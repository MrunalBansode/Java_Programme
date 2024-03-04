package assinment_1;

import java.util.Arrays;

public class Seraching_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linear search
		
/*		int a[] = {12,12,34,32,45,36};
		int search_el = 11;
		boolean b = false;
		for(int i=0; i<a.length; i++)
		{
			if(search_el == a[i])
			{
				System.out.println("Element found at " +i + " index");
				b=true;
				break;
			}
		}
		if(b==false)
		{
		System.out.println("element not found");
		}
	*/	
		//Binary search
		
		int a1[] = {1,2,3,4,5,6,7,8,9,10}; //should be in sorted order
		
		int key = 2;
		boolean b = false;
		 int l = 0;
		 int h= a1.length-1;
		 while(l<=h)
		 {
			 int m= (l+h/2);
			 if(a1[m] == key)
			 {
				 System.out.println("Element found...");
				 b = true;
				 break;
			 }
			 if(a1[m] < key)
			 {
				 l=m+1;
			 }
			 if(a1[m]  > key)
			 {
				 h=m-1;
			 }
		 }
		 if (b==false)
		 {
			 System.out.println("Element not found...");
		 }
		 
		 //Approach 2
		 
		 System.out.println("Element found at " + Arrays.binarySearch(a1 , 8) + " index");
		 
	}

}
