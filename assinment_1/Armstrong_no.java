package assinment_1;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// armstrong number means 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		int a = 153;
		int rem , result = 0;
		int orin = a;
		while(orin != 0)
		{
			rem = orin%10;
			result += ( Math.pow(rem, 3));
			orin = orin/10;
		}
		System.out.println(result);
		if(result == a) {
			System.out.println("armstrong no.");
		}
		else
		{
			System.out.println("not armstrong no.");
		}
	}

}
