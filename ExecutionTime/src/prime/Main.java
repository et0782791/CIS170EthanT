package prime;

public class Main {

    public static void main(String[] args)
    {
        PrimeNumbers prime = new PrimeNumbers();
        EfficientPrime ePrime = new EfficientPrime();
        SieveOfEratosthenes sPrime = new SieveOfEratosthenes();

        System.out.println("8,000,000");
        System.out.println("-----------");
        prime.returnPrime(8000000);
        ePrime.returnPrime(8000000);
        sPrime.returnPrime(8000000);

        System.out.println("10,000,000");
        System.out.println("-----------");
        prime.returnPrime(1000000);
        ePrime.returnPrime(1000000);
        sPrime.returnPrime(1000000);

        System.out.println("14,000,000");
        System.out.println("-----------");
        prime.returnPrime(14000000);
        ePrime.returnPrime(14000000);
        sPrime.returnPrime(10000000);

        System.out.println("16,000,000");
        System.out.println("-----------");
        prime.returnPrime(16000000);
        ePrime.returnPrime(16000000);
        sPrime.returnPrime(16000000);

        System.out.println("18,000,000");
        System.out.println("-----------");
        prime.returnPrime(18000000);
        ePrime.returnPrime(18000000);
        sPrime.returnPrime(18000000);
    }
}

