class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int s=n;
        int p=n;
        while(s!=0){
            int ls=s%10;
            s/=10;
            sum+=ls;
            product*=ls;
        }
        int f=product+sum;
        if(n%f==0) return true;
        else return false;
        
    }
}