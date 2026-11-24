class Solution {
    public void generate(int[] nums,int index, ArrayList<Integer>current,List<List<Integer>>ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        //pick
        current.add(nums[index]);
        generate(nums,index+1,current,ans);
        current.remove(current.size()-1);

        //not pick
        generate(nums,index+1,current,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
          generate(nums,0,new ArrayList<>(),ans);
          return ans;
    }
}