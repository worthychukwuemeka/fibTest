public class Main {
    public static void main(String[] args) {
        Fib fib = new Fib();

        // Example usage:
        for (int i = 0; i <= 6; i++) {
            System.out.println("Fibonacci(" + i + "): " + fib.calculateFibonacci(i));
        }
    }
}
