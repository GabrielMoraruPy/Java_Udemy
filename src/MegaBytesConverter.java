public class MegaBytesConverter {

    public static void main(String[] args){
        printMegaBytesAndKyloBytes(2500);
    }

    public static void printMegaBytesAndKyloBytes(int kiloBytes){
        int megaBytes = kiloBytes/1024;
        int remainingKiloBytes = Math.round(kiloBytes % 1024);
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
