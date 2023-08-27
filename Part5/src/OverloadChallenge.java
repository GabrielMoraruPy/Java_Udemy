public class OverloadChallenge {

    public static void main(String[] args){
        System.out.println(convertToCentimeters(10));
        System.out.println(convertToCentimeters(5, 8));

    }

    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingInches){
        int heightInInches = (heightInFeet * 12) + remainingInches;
        return convertToCentimeters(heightInInches);
    }
}
