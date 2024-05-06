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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        ListNode stk=null;
        for(int n:ans){
            while(stk!=null && stk.val<n){
                stk=stk.next;
            }
            ListNode temp=new ListNode(n);
            temp.next=stk;
            stk=temp;
        }
        ListNode result = null;
        while (stk != null) {
            ListNode temp = new ListNode(stk.val);
            temp.next = result;
            result = temp;
            stk = stk.next;
        }
        return result;
    }
}
