package exceptionhadling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ProgramChecked3 {

	public static void main(String[] args)  {
		
		File file = new File("./src/exceptionhadling/data.txt");
		
		try
		{
			FileInputStream fis = new FileInputStream(file);
		}

		catch(FileNotFoundException fio)
		{
			System.out.println("FIO");
		}
		catch(IOException io)
		{
			System.out.println("IO");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}


	}

}
