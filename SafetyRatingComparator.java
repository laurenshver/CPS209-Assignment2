import java.util.*;

/**@author Lauren Shver 500776374
 * 
*/

public class SafetyRatingComparator implements Comparator<Car>{

    /**
     * compare two cars based on their safety rating
     * sorts in ascending order
     */
    public int compare(Car a, Car b){
        if(a.safetyRating < b.safetyRating) return -1;
        if(a.safetyRating > b.safetyRating) return 1;
        return 0;
    }
    
}