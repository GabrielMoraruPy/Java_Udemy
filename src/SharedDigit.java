public class SharedDigit {

    public static void main(String[] args){
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(15,67));

    }

    public static boolean hasSharedDigit(int parameter1, int parameter2){
        boolean itSharesDigit = false;

        if (parameter1 < 10 || parameter1 > 99 || parameter2 < 10 || parameter2 > 99){
        } else {
            if (parameter1 % 10 == parameter2 % 10 || parameter1 / 10 == parameter2 / 10 || parameter1 /10 == parameter2 % 10 || parameter1 % 10 == parameter2 / 10){
                itSharesDigit = true;
            }
        }
        return itSharesDigit;
    }
}
