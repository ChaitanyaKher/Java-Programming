public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
        int oneMegaByte = 1024;
        int megaBytes = kiloBytes/oneMegaByte;
        int remainingKiloBytes = kiloBytes%oneMegaByte;
        System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");}
    }
}
