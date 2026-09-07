class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int s1_table[]= new int[26];
        int s2_table[]= new int[26];

        for(char ch: s1.toCharArray()){
            s1_table[ch-'a']++;
        }

        for(int right=0;right<s2.length();right++){
              char ch_r=s2.charAt(right);
              s2_table[ch_r-'a']++;


          if(right-left+1==s1.length()){
             
             if(Arrays.equals(s1_table,s2_table)){
                return true;
             }
        char ch_l=s2.charAt(left);
        s2_table[ch_l-'a']--;
            left++;
          }
        }
        return false;
    }
}