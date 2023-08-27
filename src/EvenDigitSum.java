public class EvenDigitSum {

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(1234));
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;

        if(number < 0){
            sum = -1;
        }

        while (number > 0){
            int rest = number % 10;
            if (rest % 2 == 0){
                sum += rest;
            }
            number = number / 10;
        }

        return sum;
    }
}
