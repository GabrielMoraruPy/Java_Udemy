import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        double sum = 0;


        while (counter <= 5){
            System.out.print("Enter number #" + counter + ": ");
            String nextNumber = input.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Value");
            }

        }
        System.out.println("The sum is: " + sum);

    }
}
