public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] Array = {20,35,-15,7,55,1,-22};

        for (int gap=Array.length/2;gap>0;gap/=2){
            System.out.println("Gap is "+gap);
            //Insertion Sort
            for (int i = gap; i<Array.length; i++){
                int newElement = Array[i];
                System.out.println("Element stored is "+newElement+" at index "+i);

                int j = i;
                System.out.println("Compared elements are = "+Array[j-gap]+">"+Array[j]+"="+((Array[j-gap]>Array[j])?"true":"false"));
                while (j>=gap && Array[j-gap]>newElement){
                    System.out.println("Successfully swapped elements are = "+Array[j]+","+Array[j-gap]);
                    Array[j] = Array[j-gap];
                    j-=gap;
                    System.out.println("j = "+j);
                    System.out.println();
                }

                Array[j] = newElement;
                System.out.println();
            }
            System.out.println();
        }

        for (int j:Array){
            System.out.print(j+" ");
        }
    }
}