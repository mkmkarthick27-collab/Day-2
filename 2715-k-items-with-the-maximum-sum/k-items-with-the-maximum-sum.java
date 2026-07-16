class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        int sum = 0;

        // Pick all possible 1's first
        if (k <= numOnes) {
            return k;
        }

        sum = numOnes;
        k = k - numOnes;

        // Pick 0's (sum does not change)
        if (k <= numZeros) {
            return sum;
        }

        k = k - numZeros;

        // Remaining picks are -1's
        sum = sum - k;

        return sum;
    }
}