import java.util.Scanner;

public class ReadUserInput {
    public static void nextInput(){
        int i = 0;
        Scanner newScanner = new Scanner(System.in);
        int sum = 0;
        while(i!=10){
            boolean hasNextInt = newScanner.hasNextInt();

            if (hasNextInt) {
                System.out.println("Enter number #" + i);
                sum = sum + newScanner.nextInt();
                i++;
            } else System.out.println("Unable to parse the integer.");
        }
        System.out.println(sum);
        newScanner.close();

    }
}
