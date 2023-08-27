
public class GreatestCommomDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommomDivisor(10, 20));
        System.out.println(getGreatestCommomDivisor(12, 30));
        System.out.println(getGreatestCommomDivisor(9, 18));
        System.out.println(getGreatestCommomDivisor(81, 153));


    }

    public static int getGreatestCommomDivisor(int a, int b) {
        {
            if (a < 10 || b < 10) {
                a = -1;
                b = -1;
            }

            // Apply the Euclidean algorithm to find the GCD
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            return a;
        }

    }
}
