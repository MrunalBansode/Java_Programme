package assinment_1;
import java.util.*;

public class Count_the_words {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		int count = 1;
		for(int i=0; i<f.length()-1; i++)
		{
			if((f.charAt(i)== ' ') && (f.charAt(i-1) != ' ' ))
			{
				count++;
			}
		}
		System.out.println("numbers of words : " + count);

	}

}
