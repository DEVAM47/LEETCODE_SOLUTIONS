/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        int idx=1,fidx=-1,lidx=-1,mindistance=Integer.MAX_VALUE;
        if(c==null) return ans;
        while(c!=null){
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
                    if(fidx==-1) fidx=idx;
                    if(lidx!=-1){
                        int dist=idx-lidx;
                        mindistance=Math.min(dist,mindistance);
                    }
                    lidx=idx;

            }
            idx++;
            a=a.next;b=b.next;c=c.next;

        }
        int maxdistance=lidx-fidx;
        if(maxdistance==0) maxdistance=-1;
        if(mindistance==Integer.MAX_VALUE) mindistance=-1;
        ans[0]=mindistance;
        ans[1]=maxdistance;
        return ans ;
        
    }
}