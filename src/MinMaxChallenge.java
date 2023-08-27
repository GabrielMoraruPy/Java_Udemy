import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean validValue = true;
        double minimumValue = 0;
        double maximumValue = 0;
        int loop = 0;


        do {
            System.out.print("Enter a value: ");
            String enteredValue = input.nextLine();

            try {
                double doubleValue = Double.parseDouble(enteredValue);
                if(loop == 0 || doubleValue < minimumValue){
                    minimumValue = doubleValue;
                }

                if(loop == 0 || doubleValue > maximumValue){
                    maximumValue = doubleValue;
                }
                loop ++;

            }catch (NumberFormatException nfe){
                System.out.println("Invalid Value");
                validValue = false;
            }


        } while (validValue);

        System.out.println("Minimum value is: " + minimumValue);
        System.out.println("Maximum value is: " + maximumValue);
    }
}
