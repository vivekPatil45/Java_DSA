
public class InsertionSort {
    
    public static void insertionSort1(int arr[]){

        for (int i = 1; i < arr.length ; i++) {
            
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
            printArr(arr);
        }
    }


    public static void insertionSort2(int arr[]){

        for (int i = 1; i < arr.length ; i++) {
            
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
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
        // insertionSort1(arr); //asc
        insertionSort1(arr); //desc

    }

}

/*
 * pick an element from unsorted part and place in the right pos in sorted part
 */
