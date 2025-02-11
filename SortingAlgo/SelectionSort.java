
public class SelectionSort {

    public static void selectionSort1(int arr[]){

        for (int i = 0; i < arr.length -1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            printArr(arr);
        }
    }

    public static void selectionSort2(int arr[]){

        for (int i = 0; i < arr.length -1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            printArr(arr);
        }
    }


    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        // selectionSort1(arr);// asc
        selectionSort2(arr); //desc

    }


}


/*
 * pick the smallest from unsorted put it at the beginning
 */