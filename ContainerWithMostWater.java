package LeetCode;

public class ContainerWithMostWater {
    public static int maxArea(int height[]) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        while(left!=right) {
            int ht = Math.min(height[left], height[right]);
            int width = right-left;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);
            if(height[left]<height[right]) {
                left--;
            }
            else {
                right++;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {};
        System.out.println(maxArea(height));
    }
}
