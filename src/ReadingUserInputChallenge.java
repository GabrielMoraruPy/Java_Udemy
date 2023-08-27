import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        System.out.println(getNumberFromUser(6));

    }

    public static int getNumberFromUser(int number){
        Scanner scanner = new Scanner(System.in);

        boolean validValue;
        int initialCount = 1;
        int count = number;
        int sum = 0;

        do{
            System.out.println("Enter number #" + initialCount + ": ");

            try {
                int numberIntroducedByUser = checkNumber(scanner.nextLine());
                if(validValue = true){
                    sum += numberIntroducedByUser;
                    initialCount++;
                }

            }catch (NumberFormatException e){
                System.out.println("Invalid Value");
                validValue = false;
            }

        }while (initialCount < count);

        return sum;
    }

    public static int checkNumber(String asd){

        int checkedNumber = Integer.parseInt(asd);

        return checkedNumber;
    }

}
