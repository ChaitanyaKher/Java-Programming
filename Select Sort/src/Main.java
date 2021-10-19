import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of elements in the array");
        N = in.nextInt();
        System.out.println("Enter "+N+" numbers in the array");
        int[] arr = new int[N];
        int f =N;
        for (int i = 0;i< N;i++){
            arr[i]= f;
            f--;
        }
        System.out.println("Your unsorted array is");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println(" Array after selection sort is ");

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largest = 0;
            for (int i =1; i<= lastUnsortedIndex; i++){
                if (arr[i]>arr[largest]){
                    largest = i;
                }
            }
            swap(arr,largest,lastUnsortedIndex);
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i,int j){
        if (i==j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
