public class SumOdd {

    public static void main(String[] args){


    System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }

    public static boolean isOdd(int parameter){
        boolean isOdd = false;
        if (parameter < 0){
            return isOdd;
        } else {
            if (parameter % 2 != 0){
                isOdd = true;
            }
        }
        return isOdd;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if ((end >= start) && (end > 0 && start > 0)) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
