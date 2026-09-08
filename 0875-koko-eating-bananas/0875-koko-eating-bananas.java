class Solution {
    public boolean isPossible(int piles[], int hours, int k){
        long totalHours=0;
        for(int i=0;i<piles.length;i++){
            totalHours+=(int)Math.ceil((double)piles[i]/k);
        }
        return totalHours<=hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=1000000000;
        int ans=-1;
        while(l<=r){
            int m= l+(r-l)/2;

            if(isPossible(piles,h,m)){
                 ans =m;
                 r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}