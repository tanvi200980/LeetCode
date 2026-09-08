class Solution {
    public int longestOnes(int[] arr, int k) {
       int left=0;

       int count=0;
       int max=0;

       for(int right=0;right<arr.length;right++){
        if(arr[right]==0){
            count++;
        }
        while(count>k){
            if(arr[left]==0){
                count--;
            }
            left++;
        }
        max=Math.max(max,right-left+1);
       } 
       return max;
    }
}