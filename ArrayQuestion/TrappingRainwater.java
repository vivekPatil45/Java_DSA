public class TrappingRainwater {
    
    public static int trappingRainwater(int height[]){

        int n = height.length;

        // calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate Right max boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        for (int i = 0; i < rightMax.length; i++) {
            //waterlevel = min(leftmax bound , rightmaz bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel = height[i]
            trappedWater += (waterlevel - height[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappingRainwater(height));

    }
}
