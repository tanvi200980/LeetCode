class Solution {
    public int searchInsert(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(ans==-1){
            return left;
        }
        else{
            return ans;
        }
    }
}