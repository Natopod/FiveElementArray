/*
 * 
 * I Nathanael greene  certify that this material is my original work. No other person's
 * work has been used without suitable acknowledgment and I have not made my work available to anyone else.
 */

package fiverandomstrings;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author Nathanael Greene 000336422
 */
public class FiveRandomStrings {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Random randomizer = new Random();
        int range;
        String firstInitial = "N";
        String[] randomString = new String[5];
        
        for(int i = 0; i <= randomString.length - 1; i++) {
          range = randomizer.nextInt(16) + 4;
          System.out.printf("%02d_" + StringUtils.repeat(firstInitial, range) + "\n", 3+range);
        }
    }

}
