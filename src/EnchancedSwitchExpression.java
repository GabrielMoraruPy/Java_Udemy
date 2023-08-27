public class EnchancedSwitchExpression {

    public static void main(String[] args){
        printDayOfWeek(0);
        printDayOfWeek(1);
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wendsday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid number";
        };
        System.out.println(day + " is represented by " + dayOfWeek);
    }
}
