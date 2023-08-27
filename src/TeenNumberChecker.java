public class TeenNumberChecker {

    public static void main(String[] args){
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(hasTeen(9,99,19));

    }

    public static boolean hasTeen(int firstParameter, int secondParameter, int thirdParameter){
        boolean hasTeen = (13 <= firstParameter && firstParameter <= 19) || (13 <= secondParameter && secondParameter <= 19) || (13 <= thirdParameter && thirdParameter <= 19);
        return hasTeen;
    }

    public static boolean isTeen(int firstParameter){
        boolean isTeen = (13 <= firstParameter && firstParameter <= 19);
        return isTeen;
    }
}
