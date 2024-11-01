class Solution {
    static int numberOfOnes(int n)
    {
        int count = 0;
        while (n>0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public int minBitFlips(int start, int goal) {
        int c=0;
        int xor=start^goal;
        return numberOfOnes(xor);
    }
}