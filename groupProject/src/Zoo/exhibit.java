package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class exhibit {
	private ArrayList<Integer> Mammalweights;
	private ArrayList<Integer> Reptileweights;
	private ArrayList<Integer> Birdweights;
	
	private ArrayList<String> MammalNames;
	private ArrayList<String> ReptileNames;
	private ArrayList<String> BirdNames;
	
	public exhibit() {
		setweights(0);
	}

	public exhibit(int  WeightList) {
		setweights(WeightList);
	}

	public void setweights(int WeightList) {
	
		Scanner key = new Scanner(WeightList);
		Mammalweights = new ArrayList<Integer>();
		WeightList.substring(WeightList.indexOf("-"));
		int index = 0;
		while (key.hasNext()) {
			if (key.hasNextInteger())
				grades.add(key.nextDouble());
			else if (key.hasNextInt())
				grades.add((double) key.nextInt());
			else
				key.next();
		}
	}

	public void setGrade(int spot, double grade) {
		// grades[spot] = grade;
		grades.set(spot, grade);
	}
}
