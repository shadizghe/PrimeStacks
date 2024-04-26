public class PrimeNumberStack {

    public static void main(String[] args) {
        GenericStacks<Integer> primeStack = new GenericStacks<>();

        int count = 0;
        int number = 2; // Start checking from 2 onwards

        // Generate and push first 50 prime numbers onto the stack
        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }

        // Display the prime numbers in descending order using the stack
        System.out.println("First 50 Prime Numbers in Descending Order:");
        while (!primeStack.isEmpty()) {
            System.out.println(primeStack.pop());
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
