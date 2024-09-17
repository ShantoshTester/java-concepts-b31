package arraysdemo;

public class Cars {

	public static void main(String[] args) {
		
		String car[] = new String[10];
		car[0] = "audi"; // lower bound
		car[1] = "bmw";
		car[2] = "tesla";
		car[3] = "honda";
		car[4] = "ford";
		car[5] = "kia";
		car[6] = "toyota";
		car[7] = "volwswagen";
		car[8] = "lexus";
		car[9] = "volvo"; // size -1 upper bound
		
        for (String carmakes : car) {
			System.out.println(carmakes);
		}
        
        System.out.println("********* reverse order ************");
        
        for(int i=car.length-1; i>=0; i--)
        {
        	System.out.println(car[i]);
        }

	}

}
