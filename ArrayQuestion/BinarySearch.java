
public class BinarySearch {
    public static int binaryrSearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int target = 16;
        int index = binaryrSearch(arr, target);
        System.out.println("key is at index "+index);
    }
}

/*
 * iteration 1 -  n/2
 * iteration 2 -  n/4
 * iteration 3 -  n/6
 * iteration 4 -  n/16
 *  k - n/2^k
 * n/2^k=1
 * n = 2^k
 * k = log2n
 * TC = o(logn)
 * 
 * 
 * 
 */