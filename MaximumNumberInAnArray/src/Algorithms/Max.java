package Algorithms;
public class Max {
    private int sizeOfArray;
    private int[] arr;

    public Max(int[] arr, int sizeOfArray) {
            this.arr = arr;
        this.sizeOfArray = sizeOfArray;
    }

    public int maximum(){
        int maximum = 0;
        for (int j:arr){
            if (j>maximum) {
                maximum = j;
            }
        }

        return maximum;
    }


}
