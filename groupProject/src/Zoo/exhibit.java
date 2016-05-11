package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exhibit {
	private ArrayList<Integer> Mammalweights;
	private ArrayList<Integer> Reptileweights;
	private ArrayList<Integer> Birdweights;

	private ArrayList<String> MammalNames;
	private ArrayList<String> ReptileNames;
	private ArrayList<String> BirdNames;

	public Exhibit() {
		setweights("");
	}

	public Exhibit(String AnimalString) {
		setweights(AnimalString);
	}

	public void setweights(String AnimalString) {

		Scanner key = new Scanner(AnimalString);
		Mammalweights = new ArrayList<Integer>();
		Reptileweights = new ArrayList<Integer>();
		Birdweights = new ArrayList<Integer>();

		int dash = AnimalString.indexOf("-");
		System.out.println(AnimalString);
		System.out.println(dash);

		while (key.hasNext()) {
			if (key.hasNextInt()
					&& AnimalString.substring(0, dash).equals("mammal")) {
				Mammalweights.add(key.nextInt());
				System.out.println(Mammalweights.toString());
			} else if (key.hasNextInt()
					&& AnimalString.substring(0, dash).equals("reptile")) {
				Reptileweights.add(key.nextInt());
				System.out.println(Reptileweights.toString());
			} else if (key.hasNextInt()
					&& AnimalString.substring(0, dash).equals("bird")) {
				Birdweights.add(key.nextInt());
				System.out.println(Birdweights.toString());
			} else
				key.next();
		}

		/*
		 * while (key.hasNext()) { if (AnimalString.substring(0,
		 * dash).equals("bird")) { Mammalweights.add(3);
		 * System.out.println(Mammalweights.toString());
		 * 
		 * } }
		 * 
		 * if (AnimalString.substring(0, dash).equals("reptile")) {
		 * Reptileweights.add(key.nextInt());
		 * System.out.println(Reptileweights.toString()); } if
		 * (AnimalString.substring(0, dash).equals("bird")) {
		 * Birdweights.add(key.nextInt());
		 * System.out.println(Birdweights.toString()); }
		 */

	}
	/*
	 * public void setGrade(int spot, double grade) { // grades[spot] = grade;
	 * grades.set(spot, grade); }
	 */
}