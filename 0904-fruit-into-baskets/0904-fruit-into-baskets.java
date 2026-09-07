class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
         HashMap<Integer,Integer> map =new HashMap<>();
           int max=0;
        for(int right=0;right<fruits.length;right++){
              //expansion
              int key_r=fruits[right];
               if(map.containsKey(key_r)){
                map.put(key_r, map.get(key_r)+1);
               }
               else{
                map.put(key_r,1);
               }

              while(map.size()>2){

                int key_l= fruits[left];
                map.put(key_l, map.get(key_l)-1);
            if(map.get(key_l)==0){
                map.remove(key_l);
            }
                left++;
              }
              //processing
              max= Math.max(max,right-left+1);
        }
        return max;
    }
}