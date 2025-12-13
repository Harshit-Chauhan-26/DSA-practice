public class TrappingRainwater {

    // Function to calculate trapped rainwater
    public static int trappedRainwater(int height[]) {

        int n = height.length;

        // calculate Left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // first element is its own left max

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate Right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1]; // last element is its own right max

        for (int i = n - 2; i >= 0; i--) {  
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // loop to calculate trapped water at each index
        for (int i = 0; i < n; i++) {

            // waterLevel = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = water level - height at index
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        // sample array
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        // print total trapped rainwater
        System.out.println(trappedRainwater(height));
    }
}
