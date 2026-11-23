class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int nge[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nge[i]=-1;
        }

        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    nge[i]=st.peek();
                }
            }
            st.push(arr[i%n]);
        }
        return nge;
    }
}