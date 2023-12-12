public class Fib {

    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fib fib = new Fib();

        // Example usage:
        for (int i = 0; i <= 6; i++) {
            System.out.println("Fibonacci(" + i + "): " + fib.calculateFibonacci(i));
        }
    }
}
