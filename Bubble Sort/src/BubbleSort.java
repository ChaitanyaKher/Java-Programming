public class BubbleSort {
    public BubbleSort() {
    }

    public void BubbleSort(int[] intArray, boolean mode) {
        int temp = 0;
        int swaps = 0;
        int comps = 0;
        int descComps =0;
        int descSwaps =0;
        System.out.println("Original Array is: ");
        for(int d=0;d<intArray.length;d++)
            System.out.print(intArray[d]+" ");
        System.out.println();
        if (mode) {
            for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
                for (int j = 0; j < lastIndex; j++) {
                    comps++;
                    if (intArray[j] > intArray[j + 1]) {
                        temp = intArray[j];
                        intArray[j] = intArray[j + 1];
                        intArray[j + 1] = temp;
                        System.out.println("Array after "+swaps+" swaps:");
                        swaps++;
                        for(int x=0;x<intArray.length;x++)
                            System.out.print(intArray[x]+" ");
                        System.out.println();
                    }
                }
            }
            System.out.println("Number of swaps: "+swaps);
            System.out.println("Number of comparisons: "+comps);
            System.out.println("Sorted Array in ascending order is :");
            for(int i=0;i<intArray.length;i++){
                System.out.print(intArray[i] + " ");
            }
        } else{
            for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
                for (int j = 0; j < lastIndex; j++) {
                    descComps++;
                    if (intArray[j] < intArray[j + 1]) {
                        temp = intArray[j];
                        intArray[j] = intArray[j + 1];
                        intArray[j + 1] = temp;
                        descSwaps++;
                        System.out.println("Array after "+descSwaps+":");
                        for(int x=0;x<intArray.length;x++)
                            System.out.print(intArray[x]+" ");
                        System.out.println();
                    }
                }
            }
            System.out.println("Number of swaps: "+descSwaps);
            System.out.println("Number of comparisons: "+descComps);
            System.out.println("Sorted Array in descending order is :");
            for(int i=0;i<intArray.length;i++){
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
