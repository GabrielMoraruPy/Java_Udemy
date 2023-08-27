public class NumberToWords {

    public static void main(String[] args){

        numberToWords(100);

    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int count = getDigitCount(number);

        for (int i=0; i < count; i++)       {
            int lastDigit = reversedNumber % 10;
            String numberToWord = switch (lastDigit) {
                case 0 -> "ZERO";
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> "Not a valid number";
            };
            System.out.print(numberToWord + " ");
            reversedNumber = reversedNumber / 10;
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        while(number != 0){
            int rest = number % 10;
            reversedNumber += rest;
            number = number / 10;

            if(number != 0)
            {
                reversedNumber = reversedNumber * 10;
            }
        }
        return reversedNumber;
    }


    public static int getDigitCount(int number){
        int numberOfDigits = 0;

    if (number < 0){
        numberOfDigits = -1;
    } else if (number == 0) {
        numberOfDigits = 1;
    }

        while (number != 0 && number > 0){
        number = number / 10;
        numberOfDigits += 1;
    }


        return numberOfDigits;
    }
}
