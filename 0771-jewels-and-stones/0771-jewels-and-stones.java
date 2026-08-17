class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int arr[]=new int[256];
          for(int i=0;i<jewels.length();i++){
              char ch=jewels.charAt(i);
              arr[ch]+=1;
          }
          int count=0;
          for(int i=0;i<stones.length();i++){
              char ch=stones.charAt(i);
              if(arr[ch]>0){
                  count++;
              }
          }
          return count;
    }
}