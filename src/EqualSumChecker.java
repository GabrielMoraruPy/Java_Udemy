public class EqualSumChecker {
    public static void main(String[] args){
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
        System.out.println(hasEqualSum(2,3,5));
    }

    public static boolean hasEqualSum(int firstParameter, int secondParameter, int thirdParameter){
        boolean sumIsEqual = firstParameter + secondParameter == thirdParameter;
        return sumIsEqual;
    }

}
