class Solution {
    public int fibbo(int n){
        if(n==0 ) return 0;
        if(n==1) return 1;
        return fibbo(n-2)+fibbo(n-1);
    }
    public int fib(int n) {
        // // if(n==1) return 1;
        // // else if(n==0) return 0;
        // // return fib(n-1)+fib(n-2);
        // if(n==0) return 0;
        
        // int a=1,b=1,c=0;
        // for(int i=0;i<n-2;i++){
        //     c=b;
        //     b=a+b;
        //     a=c;

        // }
        // return b;
int ans=fibbo(n);
        return ans;
    }
}