// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    /** This function gets a number and uses it as the number of terms for calculating Pi value according
		 * to method The mathematicians Gregory and Leibnitz discovered.
		 */
		int terms = Integer.parseInt(args[0]);
		int denominator = 3;
		int operator = -1;
		double sum = 1.0;
		double approxPi = 0;
		for (int i = 1; i < terms; i ++){
			sum = sum + (operator * ((double) 1/ denominator));
			denominator += 2;
			operator *= -1;
		}
		approxPi = sum*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approxPi);
	}
}
