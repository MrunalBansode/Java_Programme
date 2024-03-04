package assinment_1;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num=sc.nextInt();
       try 
       {
        System.out.println(100/num);
       }
       catch(Exception e)
       {
    	   System.out.println("invalid Input");
    	  e.printStackTrace();
       }
      

	}

}
