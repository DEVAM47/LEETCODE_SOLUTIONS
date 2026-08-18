class Solution {
    public double pow(double n,long i,double ans){
        if(i==0) return ans;
        if(i%2!=0){
            ans*=n;

        }
        return pow(n*n,i/2,ans);
    }
    public double myPow(double x, int n) {
        long m=n;
        if(m<0){ 
         m=-m;
        double res=pow(x,m,1);
        return 1/res;
        }

       return pow(x,n,1);
    }
}