class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
        HashSet<Character> set= new HashSet<>();
        int max=0;
         if(s.length()==0){
            return 0;
         }
        for(int right=0;right<s.length();right++){
            //expansion
             char ch_r= s.charAt(right);


            while(set.contains(ch_r)){
                //shrinking
                 char ch_l=s.charAt(left);
                 set.remove(ch_l);
                left++;
            }
            set.add(ch_r);
            max= Math.max(max,right-left+1);


        }
        return max;
    }
}