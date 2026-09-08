class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int ans[]= new int[k];
        for(int i=0;i<k;i++){
            int max=0;
            int element=0;

            for(int key:map.keySet()){
                if(map.get(key)>max){
                    max=map.get(key);
                    element=key;
                }
            }
            ans[i]=element;

            map.put(element,-1);
        }
       return ans;
    }
}