package Zoo;

import java.io.File;
import java.util.Scanner;

public class ExhibitTester {
	public static void main(String args[]) throws Exception {
		Scanner file = new Scanner(new File("src/Zoo/population.dat"));

		Exhibit exi = new Exhibit(file.nextLine());
		while (file.hasNextLine())
			exi.setweights(file.nextLine());

	}

}
