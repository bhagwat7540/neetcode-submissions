class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int prev = Integer.MIN_VALUE;
        int ans = 0, seq = 0;
        for(int val : set) {
            System.out.println(val);
            if(val-1 == prev) seq++;
            else seq = 1;

            prev = val;
            ans = Math.max(ans, seq);
        }

        return ans;
    }
}
