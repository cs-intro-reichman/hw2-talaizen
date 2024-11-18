// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    /** this program gets a string and a non-negative integer and prints a crowd cheering output */
            String cheeringWord = args[0].toUpperCase();
            int itarations = Integer.parseInt(args[1]);
            for (int i = 0; i < cheeringWord.length(); i ++){
                char currentChar = cheeringWord.charAt(i);
                String prefix = ("AEFHILMNORSX".indexOf(currentChar) >= 0) ? "a": "an";
                System.out.println("Give me "+ prefix + " " + currentChar + ": " + currentChar + "!");
            }
            for (int j = 0; j < itarations; j++){
                System.out.println(cheeringWord + "!!!");
            }
        }
}
