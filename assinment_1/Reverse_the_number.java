package assinment_1;
import java.util.*;
public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		// using algorithm
		
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is : " + rev);
	*/	
		//using StringBuffer class method
	/*	
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse number is : " + rev);
	*/
		
		//using StringBuilder class
		
	/*	StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("Reverse number is : " + rev);
	*/
	}

}
