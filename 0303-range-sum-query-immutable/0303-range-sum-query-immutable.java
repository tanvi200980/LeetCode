class NumArray {
    int[] p;
    public NumArray(int[] nums) {
        int n=nums.length;
        p=new int[n+1];
        p[0]=0;

        for(int i=0;i<n;i++){
            p[i+1]=p[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return p[right+1]-p[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */