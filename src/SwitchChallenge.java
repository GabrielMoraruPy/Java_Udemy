public class SwitchChallenge {

    public static void main(String[] args){
        System.out.println(giveALetter("A"));
        System.out.println(giveALetter("E"));
        System.out.println(giveALetter("T"));
    }

    public static String  giveALetter(String letter){
        String letterMessage;
        switch (letter){
            case "A":
                letterMessage = "A = Able";
                break;
            case "B":
                letterMessage = "B = Baker";
                break;
            case "C":
                letterMessage = "C = Charlie";
                break;
            case "D":
                letterMessage = "D = Dog";
                break;
            case "E":
                letterMessage = "E = Easy";
                break;
            default:
                letterMessage = "Letter not found";
                break;
        }
        return letterMessage;
    }
}
