public class PlayingCat {

    public static void main(String[] args){
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println(isCatPlaying(true,40));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying;
            if(summer){
                isPlaying = (25 <= temperature && temperature <= 45);
            } else {
                isPlaying = (25 <= temperature && temperature <= 35);
            }
        return isPlaying;
    }
}
