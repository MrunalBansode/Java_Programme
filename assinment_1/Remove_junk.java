package assinment_1;

public class Remove_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$%^#&*( latin string 1234567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}

