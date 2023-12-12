import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibEvenTest {
    @Test
    void fibTestForEvenNumbers() {
        for (int i = 2; i < 100; i += 3) {
            assertEquals(0, fibonacci(0) % 2);
        }
    }

    private int fibonacci (int n) {
        if (n <= 2) {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}