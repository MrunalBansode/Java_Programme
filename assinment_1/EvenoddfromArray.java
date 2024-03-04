package assinment_1;

public class EvenoddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,34,45,67,88,55,33};
		
		System.out.println("Even numbers in array are ");
		
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("Odd numbers in array are ");
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		
		// logic 2 using enhanced for loop
		
		System.out.println("Even numbers in array are ");
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd numbers in array are ");
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
	}

}
