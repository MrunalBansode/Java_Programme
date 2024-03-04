package assinment_1;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,  b=20;
		
		System.out.println("Before swapping values are : " +a+ " " +b);
		
		//logic 1 using third variable
		
	/*	int t=a;
		a=b;
		b=t;
	*/	
		//logic 2 using +, - operator
		
	/*	a=a+b;  //10+20=30
		b=a-b;  //30-20=10
		a=a-b;  //30-10=20
	*/
		//logic 3 using *, / operator
		
	/*	a=a*b;
		b=a/b;
		a=a/b;
	*/
		//logic 4 using single statement
		
	//	b=a+b-(a=b);
		
		System.out.println("after swapping values are :" +a+ " " +b);
	}

}
