package LeetCode;

public class PairSum2 {
    public static int[] pairSum2(int arr[], int target) {
        int pivot = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>arr[i+1]) {
                pivot = i;
            }
        }
        int left = pivot+1;
        int right = pivot;
        while(left!=right) {
            if(arr[left]+arr[right]==target) {
                return new int[]{left+1,right+1};
            }
            else if(arr[left]+arr[right]<target) {
                left = (left+1) % (arr.length);
            }
            else {
                right = ((arr.length)+right-1) % (arr.length);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {};
        int target = 5;
        System.out.println(pairSum2(arr, target));
    }
}
