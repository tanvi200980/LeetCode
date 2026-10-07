class Solution {
    public int findDays(int nums[],int cap){
        int days=1;
        int load=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]+load>cap){
                days++;
                load=nums[i];
            }
            else{
                load+=nums[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] nums, int days) {
        int low=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
        }

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int high=sum;

        while(low<=high){
            int mid=low+(high-low)/2;

            int numberOfdays=findDays(nums,mid);

            if(numberOfdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}