package ALgorithms;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        mergeSort(intArray,0,intArray.length);
        System.out.println();
        System.out.println("Sorted Array is:");
      for (int i:intArray){
            System.out.print(i+" ");}
    }

    public static void mergeSort(int[] input,int start, int end){
        if (end-start<2) return;
        int mid =(start+end)/2;

        mergeSort(input,start,mid);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        mergeSort(input,mid,end);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();
        merge(input, start,mid,end);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void merge(int[] input, int start, int mid, int end) {
        System.out.println("arrays are:");
        if (input[mid-1]<=input[mid])
            return;

        int i = start;
        int j =mid;
        int tempIndex =0;
        int[] temp = new int[end-start];
        while (i<mid && j<end){
            temp[tempIndex++] = input[i]<=input[j]?input[i++]:input[j++];
        }

        //while ()
        System.arraycopy(input, i, input, start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
}
