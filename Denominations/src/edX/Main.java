package edX;

import java.util.Locale;
import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the amount received");
            int V = in.nextInt();
            Denominations(V);
            System.out.println("Do you want to continue? Y or N:");
            s = in.nextLine().toLowerCase();
        }while (s == 'y');

    }

    public static int Denominations(int V) {
        Vector<Integer> denominations = new Vector<Integer>();
        int[] den = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = den.length;
        for (int i = n-1;i>=0;i--){
            while (V>=den[i]){
                V-=den[i];
                denominations.add(den[i]);
            }
        }
        System.out.println(denominations);
        return V;
    }
}