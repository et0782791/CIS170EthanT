package prime;

public class PrimeNumbers
{
    public static void returnPrime(long n)
    {
        long startTime = System.currentTimeMillis();

        int count = 0;
        int number = 2;


        //repeatedly find prime numbers
        while (number <= n)
        {
            boolean isPrime = true;

            //test if number is prime
            for (int divisor = 2; divisor <= (int)(Math.sqrt(number)); divisor++)
            {
                if (number % divisor == 0) // if true, number is not prime
                {
                    isPrime = false; // set prime to false
                    break;
                }
            }

            if (isPrime)
            {
                count++; //increase the count
            }
            number++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("22.5: " + (endTime - startTime) + " milliseconds");
    }
}
