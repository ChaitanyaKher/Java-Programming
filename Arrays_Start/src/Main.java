import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers();
        printArray(myIntegers);
    }

    private static int[] getIntegers() {
        System.out.println("Enter " + 5 +" integer values.\r");
        int[] values = new int[5];

        for (int j=0;j<values.length;j++){
            values[j] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.println("Element "+(i+1)+", value is "+array[i]);
        }
    }
}
