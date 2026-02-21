class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;

        for (int i = left; i <= right; i++) {
            int bitCount = countbit(i);

            if (isPrime(bitCount)) {
                res++;
            }
        }

        return res;
    }

    public int countbit(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
