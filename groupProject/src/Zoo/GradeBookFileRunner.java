package unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));

		Class class1 = new Class(file.nextLine(), file.nextInt());
		int gradeCount;
		double grade;
		String name;
		while(file.hasNext()){
			if(file.hasNextInt()){
			}
			else if(file.hasNext()){
			
			}
		}
	}		
}