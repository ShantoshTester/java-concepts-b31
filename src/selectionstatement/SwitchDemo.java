package selectionstatement;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 1;
		
		switch(x)
		{
		case 1:
			System.out.println("case 1 executed");
			break;
			
		case 2:
			System.out.println("case 2 executed");
			break;
			
		case 3:
			System.out.println("case 3 executed");
			break;
			
			default:
				System.out.println("case not matched");
		}

	}

}
