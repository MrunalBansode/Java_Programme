package assinment_1;

public class DuplicatesintheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbcdeff";
		char[] st = s.toCharArray();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			for(int j = i+1; j<s.length(); j++) {
				if(st[i] ==st[j])
				{
					System.out.print(st[j] + " ");
					count++;
					break;
					
				}
			}
			}
		System.out.println(count);
	}

}
