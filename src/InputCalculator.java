import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double numberCount = 0;

        while (true){
            System.out.print("Enter a number: ");
            String enteredValue = input.nextLine();

            try {
                double valueInt = Double.parseDouble(enteredValue);
                sum += valueInt;
                numberCount ++;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Value");
                break;
            }
        }

        long average = Math.round((double) sum / numberCount);
        System.out.println("SUM = " + sum + " AVG = " + average);
        input.close();
    }
}
