public class DecimalComparator {

    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.1246, 3.1257));
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        boolean areEqual = false;
        int firstValue = (int) (numberOne * 1000);
        int secondValue = (int) (numberTwo * 1000);

            if (firstValue == secondValue){
                areEqual = true;
            }
        return areEqual;
    }
}
