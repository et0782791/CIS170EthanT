package generics;
import java.util.ArrayList;
import java.util.Collections;

/*                                                                            *
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList: *
 * public static <E> void shuffle(ArrayList<E> list)                          *
 */


public class Main {

    // Method that shuffles an array list
    public static <E> void shuffle(ArrayList<E> list)
    {
        Collections.shuffle(list);
    }
}
