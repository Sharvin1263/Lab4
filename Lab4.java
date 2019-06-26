import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		int numSquared = 0;
		int numCubed = 0;
		String userInput = "y";
		int i;

		System.out.println("Learn your squares and cubes\n");

// Begin Power Table

		while (userInput.equals("y")) {

			// Prompt for user input.

			System.out.print("Enter an integer: ");
			userNum = scnr.nextInt();

			// Table header format.

			System.out.print("Number     Squared     Cubed\n");
			System.out.print("======     =======     =====\n");

			// Calculate squares and cubes and print formatted table output.

			for (i = 1; i <= userNum; i++) {
				numSquared = (i * i);
				numCubed = (i * i * i);
				System.out.printf("%-5d %7d %10d \n", i, numSquared, numCubed);
			}

			// Prompt user to continue with power table or not.
			// If not move on to multiplication table.

			System.out.println();
			System.out.print("Continue power table? (y/n): ");
			userInput = scnr.next();
			System.out.println();

			if (userInput.equals("n")) {
				break;
			}
		}

		// prompt user for multiplication table.

		System.out.print("Print Multiplication table? (y/n): ");
		userInput = scnr.next();
		System.out.println();

		if (userInput.equals("y")) {

			int columNum = 0;
			int j;

//Begin multiplication table.

			while (userInput.equals("y")) {

				System.out.print("Enter an integer: ");
				userNum = scnr.nextInt();
				System.out.println();

				// Table header and format

				for (i = 1; i <= userNum; i++) {
					System.out.printf("%4d", i);
				}
				System.out.println();
				for (i = 1; i <= userNum; i++) {
					System.out.printf("%4s", "=");
				}

				System.out.println();

				// Multiplication table calculations and formatted table poutput..

				for (i = 1; i <= userNum; i++) {

					for (j = 1; j <= userNum; j++) {
						columNum = i * j;
						if (j == 1) {
							System.out.printf("%-3d|", columNum);
						} else {

							System.out.printf("%4d", columNum);
						}
					}
					System.out.println();

					// Prompt user to continue with multiplication table otherwise terminate
					// program.

				}
				System.out.println();
				System.out.print("Continue multiplication table? (y/n): ");
				userInput = scnr.next();
				System.out.println();
			}

		}

		System.out.println("Done!");
	}

}

/*
 * nearHundred
 * 
 * public boolean nearHundred(int n) { if ((n >= 90 && n <= 110) || (n >= 190 &&
 * n <=210)){ return true; } return false; }
 */
