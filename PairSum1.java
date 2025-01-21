package LeetCode;

public class PairSum1 {
    public static int[] pairSum1(int arr[], int target) {
        int left = 0;
        int right = arr.length-1;
        while(left!=right) {
            if(arr[left]+arr[right]==target) {
                return new int[]{left,right};
            }
            else if(arr[left]+arr[right]<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {};
        int target = 5;
        System.out.println(pairSum1(arr, target));
    }
}
