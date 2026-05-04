class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int key : map.keySet()) {
            pq.add(new Integer[]{map.get(key), key});

            if(pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        int i=0;
        while(i < k) {
            ans[i] = pq.poll()[1];
            i++;
        }

        return ans;
    }
}
