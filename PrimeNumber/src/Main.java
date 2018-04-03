import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {

        //determines how high of a number to look for primes
        long n = 20_000;

        //creates a new array list to store the primes
        java.util.List<Long> aList = new java.util.ArrayList<>();

        //Creates a .dat file to store the primes in
        RandomAccessFile file = new RandomAccessFile("PrimeNumbers.dat", "rw");


        long count = 0; // Count the number of prime numbers
        long number = 2; // A number to be tested for primeness
        int squareRoot = 1; // Check whether number <= squareRoot

        if(file.length() > 0) {
            file.seek(file.length() - 8);
            number = file.readLong() + 1;
            file.seek(0);
            try {
                for (int i = 0; i < 10000; i++) {
                    aList.add(file.readLong());
                }
            } catch (EOFException e) {
            }

            squareRoot = (int)(Math.sqrt(number)) + 1;
            count = file.length() / 8;
        }


        //finds primes
        while (number <= n) {
            boolean isPrime = true;
            if (squareRoot * squareRoot < number)
                squareRoot++;

            while(true) {
                isPrime = true;
                int k;
                for (k = 0; k < aList.size() && aList.get(k) <= squareRoot; k++) {
                    if (number % aList.get(k) == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (file.getFilePointer() == file.length()) {
                    break;
                }

                if (!isPrime) {
                    break;
                } else  {
                    aList.clear();
                    try {
                        for (int i = 0; i < 10000; i++) {
                            aList.add(file.readLong());
                        }
                    } catch (EOFException e) {
                    }
                }
            }

            if (isPrime) {
                count++;
                System.out.println(count + "\t" + number + "\t" + aList.size());
                file.writeLong(number);
                aList.clear();
                file.seek(0);
                try {
                    for (int i = 0; i < 10000; i++) {
                        aList.add(file.readLong());
                    }
                } catch (EOFException e) {
                }
            }

            number++;
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
        file.close();
    }
}