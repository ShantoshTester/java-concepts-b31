package selectionstatement;

public class SwitchDays {

	public static void main(String[] args) {
		
		int days = 2;
		
		switch(days)
		{
		case 1:
			System.out.println("Horrifying Monday!");
			break;
			
		case 2:
			System.out.println("Terrifying Tuesday!");
			break;
			
		case 3:
			System.out.println("Wonderful Wednesday!");
			break;
			
		case 4:
			System.out.println("Thoughtful Thursday!");
			break;
			
		case 5:
			System.out.println("TGIF Friday!");
			break;
			
		case 6:
			System.out.println("Party Party Party Satisifying Saturday!");
			break;
			
		case 7:
			System.out.println("Cool Sunday");
			break;
			
			default:
				System.out.println("Bored with Life");
		}

	}

}
