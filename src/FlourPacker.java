public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int totalSize = bigCount*5 + smallCount;

        if(totalSize < goal){
            return false;
        }

        if(goal % 5 > smallCount){
            return false;
        }


        return true;
    }

}
