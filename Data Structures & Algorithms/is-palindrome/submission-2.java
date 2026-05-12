class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i <= j) {
            while(i<=j && !isAlphanumeric(s.charAt(i))) i++;
            while(i<=j && !isAlphanumeric(s.charAt(j))) j--;

            if(i >= j) return true;
            
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;

            i++;
            j--;
        }

        return true;
    }

    private boolean isAlphanumeric(char ch) {
        if(ch>='a' && ch<='z') return true;
        if(ch>='A' && ch<='Z') return true;
        if(ch>='0' && ch<='9') return true;
        return false;
    }
}
