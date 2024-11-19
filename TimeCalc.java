public class TimeCalc {
    public static void main(String[] args) {
        /** This function gets a time input which is given using the 24-hour hh:mm format 
         * and a number of minutes to add to it and calculates the resulting time using the 
         * 24-hour hh:mm format. */

        // The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        String addZeroMinutes = "";
        String addZeroHours = "";
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        if (newMinutes < 10) addZeroMinutes = "0";
        if (newHours < 10) addZeroHours = "0";

        System.out.println(addZeroHours + newHours + ":" + addZeroMinutes + newMinutes);
    }
}
