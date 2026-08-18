class Solution {
    public int mySqrt(int x) {
        long i=0,j=x;
        int ans=-1;
        while(i<=j){
            long mid=i+(j-i)/2;
            long r=mid*mid;
            if(r==x){
                ans=(int)mid;
                return ans;
            }
            else if(r>x){
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
        return (int)j;
    }
}