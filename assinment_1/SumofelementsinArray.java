package assinment_1;

public class SumofelementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {12,2,54,13,1,0};
		//logic 1
	/*	int sum = 0;
		for(int i=0; i<=s.length; i++)
		{
			sum = sum + s[i];
		}
	*/
		
		//logic 2
	/*	int sum = 0;
		sum= s[0] + s[1] + s[2] + s[3] + s[4] + s[5];
	*/	
		
		//logic 3
		int sum = 0;
		for(int value : s)
		{
			sum = sum+value;
		}
		
		System.out.println("sum of elements in array is " + sum);
		
		
	}

}
