package challenges;

public class NumberThree {
    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     * <p>
     * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
     * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     * <p>
     * The method should return a new string representing the input time in 24 hour format.
     * <p>
     * timeConversion has the following parameter(s):
     * <p>
     * Example:
     * s: 07:05:45AM
     * return: 07:05:45
     * <p>
     * Example:
     * s: 07:05:45PM
     * return: 19:05:45
     *
     * @param s a string representing time in 12 hour format
     * @return the string s in 24 hour format
     */
    public String timeConversion(String s) {
        // Delete the line below and implement the method!
        String military = "";
        int con = Integer.parseInt(s.substring(0, 2));

        if (s.endsWith("AM")) {
            if (con == 12) {
                military = "00" + s.substring(2, s.indexOf("AM"));
            } else
                military = s.substring(0, s.indexOf("AM"));
        }
        if (s.endsWith("PM")){
            if(con!=12){
                military = con + 12 + s.substring(2, s.indexOf("PM"));}
            else
                military= s.substring(0, s.indexOf("PM"));
        }

        return military;
    }
}
