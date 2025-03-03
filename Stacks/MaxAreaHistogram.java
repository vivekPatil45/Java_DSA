import java.util.Stack;

public class MaxAreaHistogram {
    

    // given an array of integer hieghts representinf the histo
    // bar height where the width of each bar is 1 return the
    // area of the largest rectangle in the histo
    // width -> 1)next smaller left 2)next smaller right
    // use the logic of nextgreater element

    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                // -1
                nsr[i] = arr.length;
            }else{
                // top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                // -1
                nsl[i] = -1;
            }else{
                // top
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current area : width = j - i - 1 = nsr[i] - nsl[i] - 1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area in Histogram = "+ maxArea);
    }
    

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
