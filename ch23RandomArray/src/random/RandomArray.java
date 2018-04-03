package random;

import java.util.Random;

public class RandomArray
{
    static Random random = new Random();

    public static int[] loadArray(int numEntries)
    {

        int[] theArray = new int[numEntries];

        for(int i = 0; i < theArray.length; i++)
        {
            theArray[i] = random.nextInt(100); //must be 1 above desired index (99)
        } //end of for

        return theArray;
    }// end of load array
    public static void printArray(int[] arr)
    {
        int count = 1;
        //foreach
        for(int item: arr)
        {
            if(count == 6)
            {
                System.out.println();
                count = 1;
            }
            System.out.print(item + " ");
            count++;
        }
    }

}// end of class
