public class MaxSubarraySum {
    
    //Brute Force Approach
    public static void maxSubarraySum1(int num[]){
        // int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int currSum =0;
        for (int i = 0; i < num.length; i++) {
            currSum += num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxi = Math.max(maxi, currSum);
        }
        

        System.out.println("Maximum Subarray sum = "+maxi);

    }

    // Kadane's Algo  - small +ve + -ve = 0
    // TC = o(n)
    public static void maxSubarraySum2(int num[]){
        // int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int currSum =0;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxi < currSum){
                    maxi = currSum;
                }
            
            }
        }
        System.out.println("Maximum Subarray sum = "+maxi);

    }


    public static void main(String[] args) {
        int num1[] = {1,-2,6,-1,3};
        int num2[] = {-2,-3,4,-1,-2,1,5,-3};
        
        
        maxSubarraySum1(num1);
        maxSubarraySum2(num2);

    }
}

// tc = o(n^2)