package assinment_1;

public class Max_Min_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,45,56,89,29,96};
		
		int max = a[0];
		
		for (int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("maximum value in an array is " +max);
		
		int min = a[0];
		
		for (int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("minimum value in an array is "+ min);
	}

}
