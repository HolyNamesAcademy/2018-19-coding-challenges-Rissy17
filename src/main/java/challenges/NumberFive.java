package challenges;
import java.util.Arrays;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        // Delete the line below and implement the method!
       char w1 []= word1.toLowerCase().toCharArray();
       char w2 []= word2.toLowerCase().toCharArray();

       Arrays.sort(w1);
       Arrays.sort(w2);

       word1= new String(w1);
       word2= new String(w2);

      if(word1.equals(word2))
          return true;
      else
          return false;


    }
}
