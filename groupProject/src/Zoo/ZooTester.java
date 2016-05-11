package Zoo;

import gradebook.Class;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;

public class ZooTester {

	public static void main(String[] args) throws Exception {

		out.println("Welcome to the Zoo!");

		Scanner file = new Scanner(new File("src/Zoo/data.dat"));

		Zoo exi = new Zoo(file.nextLine());
		while (file.hasNextLine())
			exi.setZooAverage(file.nextLine());

		out.print("The Average Weight of All the Zoo Animals is: ");
		out.printf("%.2f\n", exi.getZooAverage());
		out.print("\n");

		// Trying to print out all the animals in the zoo:
		System.out.println("All of the Beautiful Animals in Our Lovely Zoo: "
				+ "\n");
		Scanner file2 = new Scanner(new File("src/Zoo/population.dat"));

		String out = "";
		do {
			String temp = file2.nextLine();

			System.out.println("Family: "
					+ temp.substring(0, temp.indexOf("-")) + "Type"
					+ file2.next() + "Weighs " + file2.nextInt() + " pounds"
					+ " Named " + file2.next());

			// System.out.println(out + "\n");
			// out = "";
			file2.nextLine();

		} while (file2.hasNextLine());

	}
}