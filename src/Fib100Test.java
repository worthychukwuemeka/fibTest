import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Fib100Test {

    @Test
    void testFirst100FibonacciNumbers() {
        for (int i = 0; i < 100; i++) {
            assertEquals(calculateFibonacci(i), fibonacci(i));
        }
    }

    private int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
