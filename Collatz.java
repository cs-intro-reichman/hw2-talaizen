// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    /** This function gets a number and a mode , if mode is v(verbose) it prints all hailstone sequesnces from seed 1 to the given muber unstil 
		 * they reaches 1 and print a summery that all of the hailstones reached 1. if the mode is c(concise) the function is checking the same for each hailstone without 
		 * printing each term but only the summery.
		 */
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		for(int i = 1; i < highestSeed + 1; i++){
			int counter = 2;
			int currentTerm = i;
			if (mode.equals("v")) System.out.print(i + " ");
			if(currentTerm%2 == 0){
				currentTerm /= 2;
			} else {
				currentTerm = currentTerm * 3 + 1;
			}
			if (mode.equals("v")) System.out.print(currentTerm + " ");
			while (currentTerm != 1) {
				if(currentTerm%2 == 0){
					currentTerm /= 2;
				} else {
					currentTerm = currentTerm * 3 + 1;
				}
				if (mode.equals("v")) System.out.print(currentTerm + " ");
				counter ++;
			}
			if (mode.equals("v")) System.out.println("(" + counter + ")");
		}
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
	}
}
