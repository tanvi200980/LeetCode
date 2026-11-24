class Solution {
    public void solve(int index, int n, int k,List<Integer>list,List<List<Integer>>ans){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(index>n) return;

        list.add(index);
        solve(index+1,n,k,list,ans);
        list.remove(list.size()-1);

        solve(index+1,n,k,list,ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}