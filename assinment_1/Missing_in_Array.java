package assinment_1;

public class Missing_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array should not have duplicates
		//Array No need to be sorted order
		//values should be in range
		
		int a[] = {5,2,3,4,6};
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of elements in array is " + sum);
		
		int sum1 = 0;
		for (int i=0; i<=6; i++)
		{
			sum1 = sum1+i;
		}
		System.out.println("Sum of range of elements in array is " + sum1);
		System.out.println("Missing No. is " + (sum1-sum));
	}

}
