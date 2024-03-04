package assinment_1;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using concatenation
		
		String a = "murnal";
		String rev ="";
		
		int length = a.length();
		for (int i=length-1; i>=0; i--)
		{
			rev = rev + a.charAt(i);
		}
		System.out.println("Reverse String is " +rev);
		
		//character array
		
		char b[] = a.toCharArray(); 
		int len = b.length;
		for(int i=len-1; i>=0; i--) 
		{
			rev = rev+b[i];
		}
		System.out.println("Reverse String is " +rev);
		
		//using string buffer class
		
		StringBuffer c = new StringBuffer(a);
	    System.out.println(c.reverse());
	}

}
