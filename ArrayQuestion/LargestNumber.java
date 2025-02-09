// package ArrayQuestion;

public class LargestNumber {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i< num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int num[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i< num.length; i++){
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        
        int num[] = {1,2,4,6,9,3,5};

        System.out.println("Largest Value is: "+getLargest(num));
        System.out.println("Smallest Value is: "+getSmallest(num));


    }
}
