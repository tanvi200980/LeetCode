class Solution {

   public static int BinarySearch(int[] arr, int target, int start, int end){
       int  left=start;
       int right=end;
      
      while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
         return mid;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
      }
      return -1;
       
    }

    public static int mini(int[] arr){
         int left=0;
        int last=arr[arr.length-1];
        int right=arr.length-1;
        int ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=last){
               ans=mid;
               right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }

    public int search(int[] arr, int target) {
          int pivot=mini(arr);
        int ans1=BinarySearch(arr,target,0,pivot-1);
       int ans2=BinarySearch(arr,target,pivot,arr.length-1);
       if(ans1==-1){
        return ans2;
       }
       if(ans2==-1){
        return ans1;
       }
        return -1;
       
    }
}