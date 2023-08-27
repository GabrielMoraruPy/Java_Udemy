public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(-1,2018));
        System.out.println(getDaysInMonth(1,-2020));

    }
    
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if(year < 0 || year > 9999){
            isLeapYear = false;
        } else {
            isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }

        return isLeapYear;
    }

    public static int getDaysInMonth(int month, int year){
        int daysInMonth;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            daysInMonth = -1;
        } else {
            daysInMonth = switch (month) {
                case 1 ->  31;
                case 2 -> {
                    if(isLeapYear(year)) {
                      yield 29;
                    } else {
                        yield 28;
                    }
                }
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default ->  -1;
            };
        }

        return daysInMonth;
    }
}
