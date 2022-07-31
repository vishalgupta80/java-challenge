package Challenge;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megabyteConvertor  = kiloBytes/1024;
            int remainingkb = kiloBytes%1024;

            System.out.println(kiloBytes + " KB " + megabyteConvertor + " MB " + "and " + remainingkb + " KB");
        }
    }
}
