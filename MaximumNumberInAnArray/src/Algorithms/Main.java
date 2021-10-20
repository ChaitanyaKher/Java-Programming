package Algorithms;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter" + N + " elements in the array");
        for (int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        Max num = new Max(arr,N);

        int max = num.maximum();

        System.out.println("Maximum number in the array is "+ max);

    }
}
