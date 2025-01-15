package LeetCode;

public class SearchInRotSortedArray {
    public static int search(int arr[], int target) {
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei) {
            int mid = si + (ei-si)/2;
            if(arr[mid]==target) {
                return mid;
            }
            if(arr[si]<arr[mid]) {
                if(arr[si]<=target && target<=arr[mid]) {
                    ei = mid-1;
                }
                else {
                    si = mid+1;
                }
            }
            else {
                if(arr[mid]<=target && target<=arr[ei]) {
                    si = mid+1;
                }
                else {
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};
        int target = 1;
        System.out.println(search(arr, target));
    }
}
