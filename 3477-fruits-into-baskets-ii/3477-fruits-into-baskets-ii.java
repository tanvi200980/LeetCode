class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
     int count=0;
     for(int i=0;i<f.length;i++){
        for(int j=0;j<b.length;j++){
            if(b[j]>=f[i]){
                count++;
                b[j]=0;
                break;
            }
        }
     }
     int unplaced= f.length-count;
     return unplaced;   
    }
}