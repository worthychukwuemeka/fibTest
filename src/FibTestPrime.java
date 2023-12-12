import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibTestPrime {

    @Test
    void fibTestForPrimeNumbers() {
        int[] primeNumbersUpTo100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int i = 0; i < primeNumbersUpTo100.length; i++) {
            int fibonacciResult = fibonacci(i);
            // Check if the Fibonacci result is prime
            boolean isPrime = isPrime(fibonacciResult);

            assertEquals(isPrime, true, "Fibonacci(" + i + ") is not a prime number.");
        }
    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
