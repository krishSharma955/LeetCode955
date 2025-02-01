package LeetCode;

public class TrappingRainWater {
    public static int trap(int height[]) {
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++) {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = (height.length-2); i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater = 0;
        int width = 1;
        for(int i = 0; i<height.length; i++) {
            int waterlvl = Math.min(leftmax[i], rightmax[i]);
            trappedWater += (waterlvl - height[i])*width;
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
