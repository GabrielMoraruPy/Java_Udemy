public class PositiveNegativeZero {

    public static void main(String[] args){
        checkNumber(5);
    }
    public static void checkNumber(int number){
        number = 3;
        if (number < 0) {
            System.out.println("negative");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}
