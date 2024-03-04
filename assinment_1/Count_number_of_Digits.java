package assinment_1;

public class Count_number_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 112345;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Number of Digits " + count);
	}

}
