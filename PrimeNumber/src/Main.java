import java.util.*;


public class Main {

    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);

	    int number = 0;
        int i = 0;
        String primeNumbers = "";

        System.out.println("Enter a number to see the prime numbers up to");
        int n  = input.nextInt();

        // For loop that determines prime number while i is less than or equal to n
        for (i = 1; i <= n; i++)
        {
            // counter variable
            int counter = 0;

            for(number = i; number >= 1; number--)
            {
                // if i is divisible by number with a remainder of zero, it is not prime.
                if(i % number == 0)
                {
                    //adds the counter
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("The prime numbers between 1 and " + n + " are:");
        System.out.println(primeNumbers);

    }
}
