public class Main {
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Length of Array is "+intArray.length+" and last index is at "+ (intArray.length-1));

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i = 0; i< lastUnsortedIndex; i++){
                if (intArray[i]>intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        for (int i : intArray) {
            System.out.print(i);
        }
        System.out.println("\n");
        System.out.println("My Bubble Sort");
        int[] newIntArray = {20,35,-15,7,55,1,-22};
        BubbleSort bubble = new BubbleSort();
        System.out.println("Sort in ascending order");
        bubble.BubbleSort(newIntArray, true);
        System.out.println();
        System.out.println("Sort in descending order");
        bubble.BubbleSort(newIntArray, false);
    }

    public static void swap(int[] array, int i, int j){
        if (i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
