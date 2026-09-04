class Solution {
    public int findPairs(int[] arr, int k) {
        if(k<0){
            return 0;
        }
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int old= map.get(arr[i]);
                map.put(arr[i],old+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>1){
                    count++;
                }
            }
                else if(map.containsKey(key+k)){
                    count++;
                }
            }
            return count;
        }
        
    }
