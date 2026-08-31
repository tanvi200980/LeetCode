class Solution {
    public double findMaxAverage(int[] arr, int k) {
       int sum=0;
       int left=0;
         

          double max=Integer.MIN_VALUE;
          for(int right=0;right<arr.length;right++){
               sum+=arr[right];
               if(right-left+1==k){
                    max=Math.max(max,sum);
                    sum= sum-arr[left];
                    left++;
               }
          }
       return (max/k);
    }
}