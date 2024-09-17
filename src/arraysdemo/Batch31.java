package arraysdemo;

public class Batch31 {

	public static void main(String[] args) {

		String b31[] = new String[5];
		b31[0] = "lavanya";
		b31[1] = "meena";
		b31[2] = "priya";
		b31[3] = "deepsikha";
		b31[4] = "shantosh";
		
		// how to remember and write for-each loop by our own
		for(String name :b31)
		{
			System.out.println(name);
		}
	
	}

}
