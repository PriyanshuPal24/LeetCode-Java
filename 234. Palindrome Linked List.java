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
    public ListNode findMid(ListNode head) {
		ListNode slow =head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next; //+1
			fast=fast.next.next;//+2
		}
		return slow;
	}
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) {
			return true;
		}
		//1.FIND THE MIDDLE NODE
		ListNode mid = findMid(head);
		//2. REVERSE THE 2nd HALF
		ListNode prev=null;
		ListNode curr=mid;
		ListNode next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		ListNode right=prev;
		ListNode left=head;
		
		//CHECK IF BOTH THE SIDES ARE EQUAL OR NOT
		while(right!=null) {
			if(left.val!=right.val) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
    }
}
