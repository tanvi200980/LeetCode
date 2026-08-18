class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            freq[currentChar]++; 
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch]==1){

                return i;
            }
        }
        return -1;
    }
}