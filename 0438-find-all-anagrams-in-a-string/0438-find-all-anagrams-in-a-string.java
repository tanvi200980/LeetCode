class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans= new ArrayList<>();
        int left=0;

        int p_table[]= new int[26];
        int w_table[]= new int[26];

        for(char ch: p.toCharArray()){
            p_table[ch-'a']++;
    }
        for(int right=0;right<s.length();right++){
           
           char ch_r= s.charAt(right);
           w_table[ch_r-'a']++;

            if(right-left+1==p.length()){
               if(Arrays.equals(p_table,w_table)){
                ans.add(left);
               }
             
             char ch_l=s.charAt(left);
             w_table[ch_l-'a']--;
                left++;
            }
        }
        return ans;
    }
}