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

		Scanner file = new Scanner(
				new File(
						"/ZooProjectGitHub/GroupProjectTTA/groupProject/src/Zoo/Population"));

		while (file.hasNext()) {
			String temp = "";
			temp = file.next();
			out.println(temp);

			// bird

			// 12

			// andy

			// tweet
		}
	}

}
