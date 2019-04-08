package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        // Delete the line below and implement the method!
        int maximum= Math.max(a, Math.max(b,c));
        int minimum = Math.min(a, Math.min(b,c));
        int med= (a+b+c)-(maximum+minimum);

        if(a==maximum && b==minimum){
            if(a-c==c-b)
                return true;
        }
        if(b==maximum && a==minimum){
            if(b-c==c-a)
                return true;
        }
        if(a==maximum && c==minimum){
            if(a-b==b-c)
                return true;
        }

        if(b==maximum && c==minimum){
            if(b-a==a-c)
                return true;
        }
        if(c==maximum && a==minimum){
            if(c-b==b-a)
                return true;
        }
        if(c==maximum && b==minimum){
            if(c-a==a-b)
                return true;
        }
        return false;
        }
}
