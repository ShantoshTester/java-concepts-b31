package arraysdemo;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// declare an array of type in with 5 elements
		int num[] = new int[5];
		num[0] = 22; // lower bound of an array
		num[1] = 32;
		num[2] = 18;
		num[3] = 10;
		num[4] = 15; // upper bound of an array and upper bound would be size - 1
		
		System.out.println("accessing array elements through index");
		System.out.println(num[0]);
		System.out.println(num[4]);
//		System.out.println(num[5]); // this will result in ArrayIndexOutOfBound Exception
		
		System.out.println("********** getting arrays size *************");
		int size = num.length;  // length method in array will get you the size of the array
		System.out.println("size of the given array : "+size);
		
		System.out.println("********** printing all the elements using for loop *************");
		
		for(int i=0; i<size; i++)
		{
			System.out.println(num[i]);
		}

	}

}
