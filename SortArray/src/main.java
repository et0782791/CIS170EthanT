import java.util.ArrayList;
import java.util.Collections;

/*
 * Write the following method that sorts an ArrayList:

 public static <E extends Comparable<E>> void sort(ArrayList<E> list)
 */

public class main
{
    // Method that sorts an array list
    public static <E extends Comparable<E>> void sort(ArrayList<E> list)
    {
        Collections.sort(list);
    }
}
