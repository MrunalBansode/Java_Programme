package assinment_1;
import java.util.*;
public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int org_num = num;
		
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is : " + rev);
		if (org_num==rev)
		{
			System.out.println(org_num + " is a palindrom number");
		}
		else
		{
			System.out.println(org_num + " is not a palindrom number");
		}
	}

}
