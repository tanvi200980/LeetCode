class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int first=map.get(nums[i]);
                int diff=(int)Math.abs(i-first);

                if(diff<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}