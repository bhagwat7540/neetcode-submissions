class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            int[] freq = new int[26];
            for(char ch : s.toCharArray()) {
                freq[ch - 'a'] ++;
            }

            StringBuilder sb = new StringBuilder();
            for(int f : freq) sb.append(f).append("#");

            List<String> list = map.getOrDefault(sb.toString(), new ArrayList<>());
            list.add(s);
            map.put(sb.toString(), list);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet()) {
            ans.add(new ArrayList<>(map.get(s)));
        }

        return ans;
    }
}
