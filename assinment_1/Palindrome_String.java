package assinment_1;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "madam";
		String org_str = a;
		String rev ="";
		
		int length = a.length();
		for (int i=length-1; i>=0; i--)
		{
			rev = rev + a.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}

}
