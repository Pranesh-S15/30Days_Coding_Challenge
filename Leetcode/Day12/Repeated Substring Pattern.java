class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length(); 
        for (int i = 0; i < s.length() / 2; i++) {
            
            if ((n % (1 + i)) == 0) {
                
                String temp = s.substring(0, i + 1); 
                int cnt = n / (1 + i); 
                while (cnt > 1) {
                    temp += s.substring(0, i + 1);
                    cnt--;
                }
                if (temp.equals(s))
                    return true; 
            }
        }
        return false;
    }
}