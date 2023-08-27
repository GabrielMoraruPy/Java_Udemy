public class SpeedConverter {

    public static void main(String[] args){

    }

    public static long toMilesPerHour(double kilometersPerHour){

        long milesPerHour = Math.round(kilometersPerHour/1.609);
        if(milesPerHour < 0) {
            System.out.println("Invalid value");
            milesPerHour = -1;
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        } else {
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
