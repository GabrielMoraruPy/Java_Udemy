public class SecondsChallenge {

    public static void main(String[] args){
        System.out.println(getDurationString(3945));

        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int remainingSeconds = seconds - hours * 3600 - minutes * 60;


        return (hours + "h " + minutes + "m " + remainingSeconds + "s.");
    }

    public static String getDurationString(int minutes, int seconds){

        getDurationString(seconds);

        int hours = minutes / 60;

        int remainingMinutes = hours - minutes;

        int remainingSeconds = seconds - hours * 3600 - minutes * 60;

        return (hours + "h " + remainingMinutes + "m " + remainingSeconds + "s.");
    }
}
