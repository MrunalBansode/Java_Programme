package assinment_1;

public class Two_dimentional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int a[][] = new int[3][2];  //multiple rows, [2] column
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;  */
		
		int a[][] = { {100,200}, 
					  {300,400},
					  {500,600} };
		
		//length of array
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		//get values from array
		
		for(int r=0; r<a.length; r++)
		{
			for(int c= 0; c<a[r].length; c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		//get values from array using enhanced loop
		
		for(int x[] : a)
		{
			for(int v:x) {
				System.out.print(v +" ");
			}
			System.out.println();
		}
		
	}

}
