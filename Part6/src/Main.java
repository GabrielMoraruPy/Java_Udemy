public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 123;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2, it was a " + switchValue);
        }
        String month = "April";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        }

        public static String getQuarter(String month){
            return switch (month) {
                case "January", "February", "March" -> "1st";
                case "April", "May", "June" -> "2nd";
                case "July", "August", "September" -> "3rd";
                case "October", "November", "December" -> "4th";
                default -> {
                    String badResponse = month + "is bad";
                    yield badResponse;
                }
            };
        }
        }
