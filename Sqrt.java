package LeetCode;

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.You must not use any built-in exponent function or operator.

public class Sqrt {
    public static int sqrt(int x) {
        if(x==0) {
            return 0;
        }
        int left = 0, right = x;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if((mid*mid)==x) {
                return mid;
            }
            else if((mid*mid)<x) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
}
