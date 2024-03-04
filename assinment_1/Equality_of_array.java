package assinment_1;

import java.util.Arrays;

public class Equality_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int a1[] = {1,2,3,4,5};
		
		//logic 1
		
/*		boolean status = Arrays.equals(a,a1);
		
		if(status == true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
*/		
		//logic 2
		boolean status = true;
		if(a.length == a1.length)
		{ 
			for(int i = 0; i<a.length; i++)
			{ 
				if(a[i] != a1[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		if(status == true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

}
