class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
      
        int pSum=0;
        int count=0;
         map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pSum+=nums[i];

            if(map.containsKey(pSum-k)){
                count+=map.get(pSum-k);
            }
           
                map.put(pSum,map.getOrDefault(pSum,0)+1);
            
        }
        return count;
    }
}