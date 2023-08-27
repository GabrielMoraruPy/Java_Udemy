public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(0));


    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfectNumber = false;
        int sum = 0;
        if (number < 1) {
            isPerfectNumber = false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {

                sum += i;
            }
            if(sum == number){
                isPerfectNumber = true;
            }
        }

        return isPerfectNumber;
    }
}
