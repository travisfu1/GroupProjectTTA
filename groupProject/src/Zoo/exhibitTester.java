package Zoo;

import java.io.File;
import java.util.Scanner;

public class exhibitTester {
	public static void main(String args[]) throws Exception {
		Scanner file = new Scanner(new File("src/Zoo/population.dat"));

		exhibit exi = new exhibit(file.nextLine());
		while (file.hasNextLine())
			exi.setweights(file.nextLine());

	}

}
