package prime;

public class SieveOfEratosthenes
{
    public static void returnPrime(int n) {
        long startTime = System.currentTimeMillis();

        boolean[] primes = new boolean[n + 1]; // prime number sieve

        //Initialize primes [i] to true
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int k = 2; k <= n / k; k++) {
            if (primes[k]) {
                for (int i = k; i <= n / k; i++) {
                    primes[k * i] = false;
                }
            }
        }
        int count = 0; // count the number of prime numbers found so far
        for(int i = 2; i < primes.length; i ++)
        {
            if(primes[i])
            {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("22.7: " + (endTime - startTime) + " milliseconds");
    }
}
