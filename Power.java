package LeetCode;

//Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

public class Power {
    public static double pow(double x, long n) {
        long N = n;
        if(N<0) {
            x = 1/x;
            N = -N;
        }
        if(N==0) {
            return 1;
        }
        double halfPow = pow(x, N/2);
        if(N%2!=0) {
            return x*halfPow*halfPow;
        } 
        return halfPow*halfPow;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, -2));
    }
}
