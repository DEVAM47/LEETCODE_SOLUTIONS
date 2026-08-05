class Solution {
    public int mySqrt(int x) {
        if (x==0) return 0;

        long hi=x,lo=1,mid=0;
        while(lo<=hi){
            mid=(hi+lo)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if (mid*mid>x) hi=mid-1;
            else lo=mid+1;

        }
        return (int)hi;
       
    }
}