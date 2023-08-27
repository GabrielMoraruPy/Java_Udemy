public class LeapYear {

    public static void main(String[] args){
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1924));

    }

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    } else {
                        isLeap = false; // Assign a value to isLeap
                    }
                } else {
                    isLeap = true;
                }
            } else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }
        return isLeap;

    }
}
