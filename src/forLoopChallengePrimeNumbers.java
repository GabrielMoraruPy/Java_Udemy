public class forLoopChallengePrimeNumbers {

    public static void main(String[] args) {
        primeNumberCounter(100);

    }

    public static int primeNumberCounter(int range) {
        int counter = 0;
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= i / 2; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                counter++;
                System.out.println(i + " is a prime number");
            if(counter >= 3){
                break;
            }
            }
        }
        System.out.println("Number of prime numbers is " + counter);
        return counter;
    }

}
