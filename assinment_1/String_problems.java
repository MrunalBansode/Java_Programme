package assinment_1;

public class String_problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string are case sensitive
		
		String s = "Mrunal";
		System.out.println(s);
		
		System.out.println(s.length());
		
		//Connect string
		
		String s1 = "Welcome";
		String s2 = "to java";
		String s3 = "Automation";
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		// trim() 
		
		s = "  Automation  ";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//charAt()
		s = "Welcome";
		 System.out.println(s.charAt(0));
		 
		 System.out.println(s.charAt(3));
		
		// contains() return true or false
		 
		 System.out.println(s.contains("Wel")); //true
		 
		 System.out.println(s.contains("te")); //false
		 
		 System.out.println(s.contains("wel")); //false
		 
		 //equals() , equalsIgnore() compare 2 strings
		 //return boolean value
		 
		 s1 = "WELCOME";
		 s2 = "welcome";
		 
		 System.out.println(s1.equals(s2));  //false
		 
		 System.out.println(s1.equalsIgnoreCase(s2));  //true
		 
		 //replace() replace single/multiple characters in a string
		 
		 s = "Welcome to selenium automation testing selenium training";
		 
		 System.out.println(s.replace('t', 'k'));
		 
		 System.out.println(s.replace("selenium", "java"));
		 
		 //substring() to extract substring from main string
		 
		 s = "Welcome";
		 
		 System.out.println(s.substring(2, 5)); //loc
		 
		 System.out.println(s.substring(0, 6)); //welcom
		 
		 //split() divide the string into multiple parts using delimiter
		 //should not use + *< > .? - 
		 s = "abc@gmail.com";
		 String a[] = s.split("@");
		 
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 
		 //toUpperCase() , toLowerCase()
		 
		 s = "WelComE";
		 
		 System.out.println(s.toLowerCase());
		 
		 System.out.println(s.toUpperCase());
		 
		 //comparison between equals and == 
		 
		 String s0 = "welcome";
		 String s4 = "welcome";
		 
		 System.out.println(s0==s4);  //true  because here is only one object
		 System.out.println(s0.equals(s4));  //true
		 
		 String a1 = new String ("welcome");
		 String a2 = new String ("welcome");
		 
		 System.out.println(a1==a2);    //false  ( here are two objects) always compare objects
		 System.out.println(a1.equals(a2));  //true  always compare value of object
		 
		 String b = "abc";
		 String b1 = new String ("abc");
		 String b2 = b1;
		 
		 System.out.println(b==b1);  //false
		 System.out.println(b.equals(b1)); //true
		 
		 System.out.println(b1==b2); //true
		 System.out.println(b1.equals(b2)); //true
	}

}
