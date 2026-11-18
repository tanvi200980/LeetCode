class Solution {
    public double myPow(double x, int n) {
        long N=n;
        return power(x,N);
    }

    public  double power(double x, long n){
       

        if(n==0){
            return 1;
        }
        if(n<0){
            return 1.0/power(x,-n);
        }
        double res=power(x,n/2);
        res=res*res;

        if(n%2==1){
            res=res*x;
        }
        return res;
    }
}