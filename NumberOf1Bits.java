package LeetCode;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            if((n & 1)!=0) { //checking LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // Count number of 1s, also k/a Hamming Weight
        System.out.println(hammingWeight(11));
    }
}
