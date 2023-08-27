public class LargestPrime {

    public static void main(String[] args) {
       System.out.println (getLargestPrime(21));
       System.out.println (getLargestPrime(217));
    }

    public static int getLargestPrime ( int number){
        int largestPrimeNumber = 0;
        if(number < 2){
            largestPrimeNumber = -1;
        }

        for(int i = 2; i < number; i++){
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }

        if (largestPrimeNumber == 0){
            largestPrimeNumber = number;
        }

        return largestPrimeNumber;
    }
}
