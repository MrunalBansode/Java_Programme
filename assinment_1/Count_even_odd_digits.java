package assinment_1;

public class Count_even_odd_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 234789;
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)
		{
			int reminder = num % 10;
			
			if(reminder%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("Digit of even numbers is " + even_count);
		System.out.println("Digit of even numbers is "+ odd_count);
		
		
		
		
	}

}
