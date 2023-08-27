public class BarkingDog {

    public static void main(String[] args){


        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, 8));
        doSomething(1);
        doSomething(1);


    }

    public static boolean shouldWakeUp( boolean barking, int hourOfDay){
        boolean shouldWakeUp = (barking && ((hourOfDay >= 0 && hourOfDay <= 8) || (hourOfDay >= 21 && hourOfDay <=24)) );

        return shouldWakeUp;
    }

    public static void doSomething(int parameterA){
        return;
    }

    public static void doSomething(float parameterA){

    }
}



//        if (barking == true){
//            if (hourOfDay < 0 || hourOfDay > 24){
//                barking = false;
//            } else {
//                if (hourOfDay < 8 || hourOfDay > 22){
//                    barking = true;
//                }
//                else {
//                    barking = false;
//                }
//            }
//        }