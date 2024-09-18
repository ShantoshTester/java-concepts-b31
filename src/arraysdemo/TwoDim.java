package arraysdemo;

public class TwoDim {

	public static void main(String[] args) {
		
		String s[][] = new String[3][3];
		
		s[0][0] = "A1";
		s[0][1] = "B1";
		s[0][2] = "C1";
		
		s[1][0] = "A2";
		s[1][1] = "B2";
		s[1][2] = "C2";
		
		s[2][0] = "A3";
		s[2][1] = "B3";
		s[2][2] = "C3";
		
		// length method to get the size of given array
		System.out.println("size of row : "+s.length);
		System.out.println("size of col : "+s[0].length);
		
		//fetch the data from 2D array
		System.out.println(s[0][0]);
		System.out.println(s[1][2]);
		System.out.println(s[2][1]);
		
		System.out.println("***** printing all the values using for loop ******");
		
		for(int i=0; i<s.length;i++) 
		{
			for(int j=0; j<s[0].length;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();	
		}
	}

}














