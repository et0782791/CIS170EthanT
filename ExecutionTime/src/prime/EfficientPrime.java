package prime;
import java.util.ArrayList;
import java.util.List;

public class EfficientPrime
{
    public static void returnPrime(long n)
    {
        long startTime = System.currentTimeMillis();

        List<Long> list = new ArrayList<>();

        int count = 0; // count the number of prime numbers
        long number = 2; // A number to be tested for primeness
        int squareRoot = 1; // Check whether number <= squareRoot

        //repeatedly finds prime numbers
        while (number <= n)
        {
            //assume number is prime
            boolean isPrime = true;
            if(squareRoot * squareRoot < number)
                squareRoot++;

            //test whether number is prime
            for (int k = 0; k < list.size() && list.get(k) <= squareRoot; k++)
            {
                if(number % list.get(k) == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                count++;
            }
            number++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("22.6: " + (endTime - startTime) + " milliseconds");
    }
}
