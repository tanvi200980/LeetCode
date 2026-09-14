class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=Integer.MIN_VALUE;
        int vowelCount=0;

        for(int right=0;right<s.length();right++){
           if(s.charAt(right)=='a'|| s.charAt(right)=='e'|| s.charAt(right)=='i'|| s.charAt(right)=='o'|| s.charAt(right)=='u'){
            vowelCount++;
           }

            if(right-left+1==k){
                max=Math.max(max,vowelCount);
                if(s.charAt(left)=='a'||s.charAt(left)=='e'||s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'){
                    vowelCount--;
                }
                left++;
            }
        }
          return max;
    }
}