package assinment_1;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using Bubble method
	   int a[] = { 23, 12, 43, 45, 56, 1,0};
	   System.out.println("Arrays before sorting : " + Arrays.toString(a));
	   int n= a.length;
	   for (int i=0; i<n-1; i++)
	   {
		   for(int j=0; j<n-1; j++)
		   {
			   if(a[j] > a[j+1])
			   {
				   int temp=a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
			   }
		   }
	   }
	   System.out.println(" Arrays after sorting " + Arrays.toString(a));
	   
	   //using Built in method
	   
	   int b[] = { 12,34,23,56,76,45};
	   
	   System.out.println("Arrays before sorting : " + Arrays.toString(b));
	   Arrays.parallelSort(b);
	   System.out.println(" Arrays after sorting " + Arrays.toString(b));
	   
	   System.out.println("Arrays before sorting : " + Arrays.toString(b));
	   Arrays.sort(b);
	   System.out.println(" Arrays after sorting " + Arrays.toString(b));
	   
	   //sorting element in descending order
	   
	   Integer b1[] = { 12,34,23,56,76,45};
	   System.out.println("Arrays before sorting : " + Arrays.toString(b1));
	   Arrays.sort(b1, Collections.reverseOrder());
	   System.out.println(" Arrays after sorting " + Arrays.toString(b1));
	   
	   //smallest no. in the array
	   
	   int[] r = {23,123,56,32,67,78,9};
	   Arrays.sort(r);
	   System.out.println(r[0]);
	   }
	}


