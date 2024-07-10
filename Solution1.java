public class Solution1 {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0){
                return false;
            }
            return (n & (n - 1)) == 0;
        }
        public static void main(String[] args) {
            Solution1 solution1 = new Solution1();
            int n1 = 2;
            System.out.println(solution1.isPowerOfTwo(n1));
            int n2 = 4;
            System.out.println(solution1.isPowerOfTwo(n2));
            int n3 = 5;
            System.out.println(solution1.isPowerOfTwo(n3));
        }
    }