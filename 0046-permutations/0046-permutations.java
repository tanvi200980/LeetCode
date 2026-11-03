class Solution {
    public void fun(int nums[],int start,List<List<Integer>>ans){
        if(start==nums.length){
           List<Integer>temp=new ArrayList<>();
           for(int i:nums){
            temp.add(i);
           }
           ans.add(temp);
           return;
        }
        for(int i=start;i<nums.length;i++){
           int temp=nums[i];
           nums[i]=nums[start];
           nums[start]=temp;


           fun(nums,start+1,ans);

            temp=nums[i];
           nums[i]=nums[start];
           nums[start]=temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();

       fun(nums,0,ans);
       return ans;
    }
}