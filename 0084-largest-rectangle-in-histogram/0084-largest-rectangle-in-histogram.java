class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();

    // NEXT SMALLER ELEMENT
         int nse[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            nse[i]=arr.length;
         }

         for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nse[st.pop()]=i;
            }
            st.push(i);
         }
         st.clear();
    // PREVIOUS SMALLER ELEMENT
           int pse[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            pse[i]=-1;
         }

         for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                pse[st.pop()]=i;
            }
            st.push(i);
         }
         int maxArea=0;
         for(int i=0;i<arr.length;i++){
            int width=nse[i]-pse[i]-1;
            int area=arr[i]*width;

            maxArea=Math.max(maxArea,area);
         }
         
         return maxArea;
    }
}