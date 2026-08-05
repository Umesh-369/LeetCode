class Solution {
    public int rob(int[] nums) {
        int prev2 = 0; // Best total up to 2 houses back
        int prev1 = 0; // Best total up to 1 house back

        for (int num : nums) {
            // Compare robbing this house vs. skipping this house
            int current = Math.max(prev2 + num, prev1);
            
            // Move our pointers forward for the next house
            prev2 = prev1;
            prev1 = current;
        }

        return prev1; // Final answer after checking all houses
    }
}