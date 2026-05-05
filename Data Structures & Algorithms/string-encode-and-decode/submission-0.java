class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length()).append(",");
        }
        sb.append("#");
        for(String s : strs) {
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str.length() == 0) return ans;
        List<Integer> sizes = new ArrayList<>();
        
        int i=0;
        while(str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.valueOf(sb.toString()));
            i++;
        }
        i++;

        for(int size : sizes) {
            ans.add(str.substring(i, i+size));
            i+=size;
        }

        return ans;
    }
}
