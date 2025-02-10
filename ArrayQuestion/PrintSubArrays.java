public class PrintSubArrays {
    

    public static void printSubarrays(int num[]){
        int c =0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum +=num[k];
                    System.out.print(num[k]+ " ");//subarray

                }
                maxi = Math.max(sum, maxi);
                mini = Math.min(sum, mini);
                sum = 0;
                c++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray = "+c);
        System.out.println("Maximum Subarray sum = "+maxi);
        System.out.println("Minimum Subarray sum = "+mini);

    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        printSubarrays(num);
    }
}

/*
 * Total Subarray n(n+1)/2
 * TC = O(n^3)
 */
