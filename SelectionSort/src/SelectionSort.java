public class SelectionSort {
    private int[] arr;
    private int comps,swaps=0;
    public SelectionSort(){}
    public SelectionSort(int[] arr){
        this.arr = arr;
    }

    public void SortMe(){
        System.out.println("Original Array is: ");
        for(int d=0;d<arr.length;d++)
            System.out.printf(arr[d]+" ");
        System.out.println();
        for (int i = arr.length-1;i>0;i--){
            int largest = 0;
            for (int j =1;j<=i;j++){
                comps++;
                if (arr[j]>arr[largest]){
                    largest =j;
                }
            }
            swap(arr, largest,i);
        }
        System.out.println("Sorted Array is:");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("No. of Swaps: "+swaps);
        System.out.println("No. of Comparisons: "+comps);
    }
    public void swap(int[] arr, int i, int j){
        if (i==j)
            return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
        swaps++;
    }
}