public class FirstLastDigitSum {

    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(-222));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sumOfFirstAndLastDigit = 0;
        if(number < 0){
            sumOfFirstAndLastDigit = -1;
        }else {
            if (number > 0 && number < 10) {
                sumOfFirstAndLastDigit = number * 2;
            }

            int firstDigit = 0;
            int lastDigit = number % 10;
            while (number != 0) {
                number = number / 10;
                if (number == 0)
                    break;
                firstDigit = number % 10;
                sumOfFirstAndLastDigit = lastDigit + firstDigit;
            }


        }
        return sumOfFirstAndLastDigit;
    }
}
